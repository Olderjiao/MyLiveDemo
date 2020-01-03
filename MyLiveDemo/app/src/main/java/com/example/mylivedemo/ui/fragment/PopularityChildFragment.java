package com.example.mylivedemo.ui.fragment;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.BaseUrl;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.PopularityEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.MyUtils;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.PopularityChildAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 11:45
 */
public class PopularityChildFragment extends BaseFragment implements HomeView<PopularityEntity> {

    private RecyclerView popu_recyc;
    //数据集合与适配器对象
    private ArrayList<PopularityEntity.MessageBean.RankPopularityBean> datas = new ArrayList<>();
    private PopularityChildAdapter adapter;

    private int  flag = 0;

    public PopularityChildFragment(int flag) {
        this.flag = flag;
    }

    @Override
    protected int setLayoutId() {
        return R.layout.rank_child_fragment;
    }

    @Override
    public void initView(View view) {
        popu_recyc = view.findViewById(R.id.supperstart_child_recyc);
        //设置显示方式
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        popu_recyc.setLayoutManager(manager);

        adapter = new PopularityChildAdapter(R.layout.rank_item,datas);
        //设置适配器
        popu_recyc.setAdapter(adapter);
        //网络请求
        RetrofitSingle
                .getInstance()
                .getIPresenter(new HomeModel(),this)
                .getRankData(ApiDoman.API_POPULARITY_RANK,30,flag);
    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        if(baseEntity != null){
            PopularityEntity entity = (PopularityEntity)baseEntity;
            datas.addAll(entity.getMessage().getRankPopularity());
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }
}
