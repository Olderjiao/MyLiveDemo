package com.example.mylivedemo.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.HotAdapter;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/28 9:04
 */
public class FragmentHot extends Fragment implements HomeView<HomeEntity> {

    private XRecyclerView hot_recyc;
    private ArrayList<HomeEntity.MessageBean.AnchorsBean> antor_list = new ArrayList<>();

    //适配器对象
    private HotAdapter adapter;

    private View banner_view;
    private Banner banner;
    //轮播图图片嘉和
    private ArrayList<String> banners = new ArrayList<>();

    //网络请求对象
    private IPresenter<HomeEntity> iPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hot_fragment, container, false);
        initView(view);
        return view;
    }
    /**
        *   @ProjectName:
        *   @Package: com.example.mylivedemo.ui.fragment
        *   @ClassName: FragmentHot
        *   @CreateDate: 2019/12/28 9:05
        *   @UpdateTime: 2019/12/28 9:05
        *   @UpdateRemark: 对布局进行初始化
        *   @Version: 版本1.0
    */
    private void initView(View view) {

        //获取控件
        hot_recyc = view.findViewById(R.id.home_vp_recyclerview);

        //设置显示方式
        GridLayoutManager manager = new GridLayoutManager(getContext().getApplicationContext(), 2);
        manager.setOrientation(GridLayoutManager.VERTICAL);
        manager.setRecycleChildrenOnDetach(true);
        hot_recyc.setLayoutManager(manager);

        //创建适配器
        adapter = new HotAdapter(getContext(),antor_list);
        //设置适配器
        hot_recyc.setAdapter(adapter);

//        adapter.addHeaderView(View.inflate(getContext(),R.layout.banner_layout,null));
        banner_view = LayoutInflater.from(getContext()).inflate(R.layout.banner_layout,null);
        //添加头布局
        hot_recyc.addHeaderView(banner_view);
        //获取到abnner
        banner = banner_view.findViewById(R.id.my_banner);
        //更改默认的刷新提示图片
        hot_recyc.setArrowImageView(R.drawable.refresh_head_back);
        //设置刷新样式
        hot_recyc.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        //刷新数据
        hot_recyc.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                //进行刷新 并且再次进行网络请求
                iPresenter.getHomeData(ApiDoman.API_DOMAN_HOMEDATA);
            }

            @Override
            public void onLoadMore() {

            }
        });
//        ((DefaultItemAnimator)hot_recyc.getItemAnimator()).setSupportsChangeAnimations(false);

        //开始加载网络数据
        iPresenter = RetrofitSingle.getInstance().getIPresenter(new HomeModel(),this);
        iPresenter.getHomeData(ApiDoman.API_DOMAN_HOMEDATA);
    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {

        HomeEntity homeEntity = (HomeEntity)baseEntity;
        antor_list.clear();
        banners.clear();
        adapter.notifyDataSetChanged();

        if(homeEntity.getStatus() == 200){
            antor_list.addAll(homeEntity.getMessage().getAnchors());
            for(int i = 0;i < homeEntity.getMessage().getBanners().size();i++){
                banners.add(homeEntity.getMessage().getBanners().get(i).getPicUrl());
            }
            //更新适配器
            adapter.notifyDataSetChanged();
            //设置轮播图属性
            banner.setDelayTime(3000);
            banner.setImageLoader(new MyBannerImageLoader());
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            banner.setImages(banners);
            banner.start();
            //停止刷新
            hot_recyc.refreshComplete();
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    /**
     * 图片加载器类
     */
    class MyBannerImageLoader extends ImageLoader{

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String)path).into(imageView);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //进行资源回收
        if(hot_recyc != null){
            hot_recyc.destroy();
            hot_recyc = null;
        }
    }
}
