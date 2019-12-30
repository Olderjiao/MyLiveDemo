package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.example.mylivedemo.ui.adapter.AttentionAdapter;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 10:54
 * 关注页面
 */
public class AttentionFragment extends Fragment implements HomeView<AttentionEntity> {

    //控件对象
    private RecyclerView recyclerView;
    //适配器对象
    private AttentionAdapter adapter;
    //数据集合
    private ArrayList<AttentionEntity.DataBean.AnchorsBean> datas = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attention_fragment, container, false);
        initView(view);
        return view;
    }

    /**
     * 初始化数据
     * @param view
     */
    private void initView(View view) {

        recyclerView = view.findViewById(R.id.vp_atten_recyc);
        //设置显示方式与滑动方向
        GridLayoutManager manager = new GridLayoutManager(getContext(), 1);
        manager.setOrientation(GridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);

        //创建适配器并且设置适配器
        adapter = new AttentionAdapter(getContext(),datas);
        recyclerView.setAdapter(adapter);

        //开始网络请求
        IPresenter<AttentionEntity> iPresenter = RetrofitSingle.getInstance().getIPresenter(new HomeModel(),this);
        iPresenter.getHomeData(ApiDoman.API_DOMAN_ATTENTIONDATA);
    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        datas.clear();
        adapter.notifyDataSetChanged();

        AttentionEntity attentionEntity = (AttentionEntity) baseEntity;
        if (attentionEntity.getStatus() == 200) {
            datas.addAll(attentionEntity.getData().getAnchors());
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }
}
