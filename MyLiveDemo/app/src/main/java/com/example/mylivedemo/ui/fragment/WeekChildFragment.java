package com.example.mylivedemo.ui.fragment;

import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.WeekEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.WeekChildAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 13:59
 */
public class WeekChildFragment extends BaseFragment implements HomeView<WeekEntity> {

    private RecyclerView week_recyc;

    private ArrayList<WeekEntity> bean = new ArrayList<>();

    //适配器对象
    private WeekChildAdapter adapter;

    @Override
    protected int setLayoutId() {
        return R.layout.rank_child_fragment;
    }

    @Override
    public void initView(View view) {
        week_recyc = view.findViewById(R.id.supperstart_child_recyc);

        //设置显示方视
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        week_recyc.setLayoutManager(manager);

        //创建适配器
        adapter = new WeekChildAdapter(bean,getContext());
        week_recyc.setAdapter(adapter);

        //进行网络请求
        RetrofitSingle.getInstance()
                .getIPresenter(new HomeModel(),this)
                .getHomeData(ApiDoman.API_WEEK_RANK);

    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        bean.clear();
        adapter.notifyDataSetChanged();
        if(baseEntity != null){
            WeekEntity entity = (WeekEntity)baseEntity;
            int status = entity.getStatus();
            Log.e("###status",status+"--->Size"+entity.getMessage().getFansRank().size());
            bean.add(entity);
            //刷新适配器
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onPause() {
        super.onPause();
        //清空集合
        bean.clear();
    }
}
