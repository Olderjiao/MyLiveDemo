package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;
import com.google.android.material.tabs.TabLayout;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/26 16:55
 */
public class FragmentHome extends Fragment {

    private TabLayout home_tab;
    private ViewPager viewPager;
    private IPresenter<HomeEntity> presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);
        initView(view);
        return view;
    }

    /**
     * 初始化方法
     * @param view
     */
    private void initView(View view) {
        home_tab = view.findViewById(R.id.home_tab);
        viewPager = view.findViewById(R.id.home_vp);

        //添加数据
        home_tab.addTab(home_tab.newTab().setText("关注"));
        home_tab.addTab(home_tab.newTab().setText("热门"));
        home_tab.addTab(home_tab.newTab().setText("新人"));
        home_tab.addTab(home_tab.newTab().setText("现场"));



    }
}
