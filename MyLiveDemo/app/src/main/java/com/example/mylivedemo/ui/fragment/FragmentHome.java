package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mylivedemo.R;
import com.google.android.material.tabs.TabLayout;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/26 16:55
 */
public class FragmentHome extends Fragment {

    TabLayout home_tab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fragment, container, false);
        initView(view);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * 初始化方法
     * @param view
     */
    private void initView(View view) {
        home_tab = view.findViewById(R.id.home_tab);

        //添加数据
        home_tab.addTab(home_tab.newTab().setText("关注"));
        home_tab.addTab(home_tab.newTab().setText("热门"));
        home_tab.addTab(home_tab.newTab().setText("新人"));
        home_tab.addTab(home_tab.newTab().setText("现场"));

    }
}
