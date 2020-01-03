package com.example.mylivedemo.ui.fragment;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.StartRankEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.RankItemAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 17:33
 */
public class SupperStartChildFragment extends BaseFragment implements HomeView<StartRankEntity> {

    private int flag;
    private RecyclerView recyclerView;

    private ArrayList<StartRankEntity.MessageBean.RankStarBean> datas = new ArrayList<>();
    //适配器对象
    private RankItemAdapter adapter;

    public SupperStartChildFragment(int flag) {
        this.flag = flag;
    }

    @Override
    protected int setLayoutId() {
        return R.layout.rank_child_fragment;
    }

    @Override
    public void initView(View view) {
        recyclerView = view.findViewById(R.id.supperstart_child_recyc);

        //设置显示方式
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        //创建适配器
        adapter = new RankItemAdapter(R.layout.rank_item,datas);
        recyclerView.setAdapter(adapter);
        //添加动画效果
        adapter.openLoadAnimation();
        //加载数据
        RetrofitSingle
                .getInstance()
                .getIPresenter(new HomeModel(),this)
                .getRankData(ApiDoman.API_DOMAN_RANK_START,30,flag);
    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        StartRankEntity startRankEntity = (StartRankEntity)baseEntity;
        if(startRankEntity != null){
            datas.addAll(startRankEntity.getMessage().getRankStar());
            adapter.notifyDataSetChanged();
//            Log.e("###startRank",startRankEntity.getStatus()+"");
        }else{
//            Log.e("###startEntity","对象为空");
        }


    }

    @Override
    public void onError(Throwable throwable) {

    }
}
