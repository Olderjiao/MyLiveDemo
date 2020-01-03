package com.example.mylivedemo.ui.fragment;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.RichRankEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.RichChildAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 8:53
 */
public class RichChildFragment extends BaseFragment implements HomeView<RichRankEntity> {

    private int flag = 0;

    public RichChildFragment(int flag) {
        this.flag = flag;
    }

    //控件对象
    private RecyclerView rich_recyc;

    //数据集合
    private List<RichRankEntity.MessageBean.RankWealthBean> datas = new ArrayList<>();
    //适配器对象
    private RichChildAdapter adapter;
    @Override
    protected int setLayoutId() {
        return R.layout.rank_child_fragment;
    }

    @Override
    public void initView(View view) {
        //获取控件对象
        rich_recyc = view.findViewById(R.id.supperstart_child_recyc);
        //设置显示方式
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rich_recyc.setLayoutManager(manager);

        //创建适配器
        adapter = new RichChildAdapter(R.layout.rank_item,datas);
        //设置适配器
        rich_recyc.setAdapter(adapter);
        //添加动画效果
        adapter.openLoadAnimation();

        //加载数据
        RetrofitSingle
                .getInstance()
                .getIPresenter(new HomeModel(),this)
                .getRankData(ApiDoman.API_DOMAN_RANK_RICH,30,flag);

    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        //清空集合数据
        datas.clear();
        adapter.notifyDataSetChanged();
        //获取网络请求下来的数据
        RichRankEntity entity = (RichRankEntity)baseEntity;
        if(datas != null&&entity != null){
            datas.addAll(entity.getMessage().getRankWealth());
        }
        //更新适配器
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onError(Throwable throwable) {

    }
}
