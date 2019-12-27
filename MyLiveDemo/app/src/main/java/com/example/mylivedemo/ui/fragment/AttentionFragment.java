package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.view.HomeView;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 10:54
 */
public class AttentionFragment extends Fragment implements HomeView<HomeEntity> {

    private RecyclerView atten_recyc;
    private ArrayList<HomeEntity.MessageBean.AnchorsBean> atten_list = new ArrayList<>();


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
        //获取控件
        atten_recyc = view.findViewById(R.id.home_vp_recyclerview);

        //设置显示方式
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        manager.setOrientation(GridLayoutManager.VERTICAL);
        atten_recyc.setLayoutManager(manager);



    }

    @Override
    public void onSuccess(HomeEntity entity) {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
