package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.NewPeopleEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.ui.adapter.NewsPeopleAdapter;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/28 9:13
 */
public class FragmentNewPeople extends Fragment implements HomeView<NewPeopleEntity> {

    private XRecyclerView newpeople_recyc;
    private NewsPeopleAdapter adapter;

    ///存储数据的集合
    private ArrayList<NewPeopleEntity.MessageBean.AnchorsBean> beans = new ArrayList<>();

    private IPresenter<NewPeopleEntity> iPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newpeople_fragment, container, false);
        initView(view);
        return view;
    }

    /**
     * 初始化布局
     * @param view
     */
    private void initView(View view) {

        //创建加载数据对象
        iPresenter = new IPresenter<>(new HomeModel(),this);
        //获取列表
        newpeople_recyc = view.findViewById(R.id.newspeople_recyc);

        //设置显示方式
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        manager.setOrientation(GridLayoutManager.VERTICAL);
        newpeople_recyc.setLayoutManager(manager);

        //创建适配器
        adapter = new NewsPeopleAdapter(getContext(),beans);
        newpeople_recyc.setAdapter(adapter);
        //加载网络数据
        iPresenter.getHomeData(ApiDoman.API_DOMAN_NEWPEOPLEDATA);
        //更改默认的刷新提示图片
        newpeople_recyc.setArrowImageView(R.drawable.refresh_head_back);
        //设置刷新样式
        newpeople_recyc.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        //刷新数据
        newpeople_recyc.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                //进行刷新 并且再次进行网络请求
                iPresenter.getHomeData(ApiDoman.API_DOMAN_NEWPEOPLEDATA);
            }

            @Override
            public void onLoadMore() {

            }
        });

    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        beans.clear();
        adapter.notifyDataSetChanged();

        NewPeopleEntity entity = (NewPeopleEntity)baseEntity;

        if(((NewPeopleEntity) baseEntity).getStatus() == 200){
            beans.addAll(entity.getMessage().getAnchors());
        }
        adapter.notifyDataSetChanged();
        newpeople_recyc.refreshComplete();
    }

    @Override
    public void onError(Throwable throwable) {

    }
}
