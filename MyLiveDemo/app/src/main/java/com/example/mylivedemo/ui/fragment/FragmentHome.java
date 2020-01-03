package com.example.mylivedemo.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.ui.activity.RankActivity;
import com.example.mylivedemo.ui.adapter.HomeVpAdapter;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/26 16:55
 */
public class FragmentHome extends Fragment {

    private TabLayout home_tab;
    private ViewPager viewPager;
    private ImageView ic_ranck;

    //viewpager需要绑定的集合
    private ArrayList<Fragment> fragments = new ArrayList<>();

    //碎片对象
    private AttentionFragment attentionFragment = new AttentionFragment();
    private FragmentHot fragmentHot = new FragmentHot();
    private FragmentNewPeople fragmentNewPeople = new FragmentNewPeople();
    private FragmentSpot fragmentSpot = new FragmentSpot();


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
        ic_ranck = view.findViewById(R.id.ic_rank_btn);

        //设置点击事件跳转
        ic_ranck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到排行界面
                Intent intent = new Intent(getContext(), RankActivity.class);
                startActivity(intent);
            }
        });

        //添加数据
        ArrayList<String> titles = new ArrayList<>();
        titles.add("关注");
        titles.add("热门");
        titles.add("新人");
        titles.add("现场");

        fragments.add(attentionFragment);
        fragments.add(fragmentHot);
        fragments.add(fragmentNewPeople);
        fragments.add(fragmentSpot);

        //viewpage适配器
        HomeVpAdapter vpAdapter = new HomeVpAdapter(getFragmentManager(), fragments, titles);
        viewPager.setAdapter(vpAdapter);
        home_tab.setupWithViewPager(viewPager);
    }
}
