package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mylivedemo.R;
import com.example.mylivedemo.ui.adapter.RankVpAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;
import com.example.mylivedemo.ui.fragment.FragmentHome;
import com.example.mylivedemo.ui.fragment.PopularityFragment;
import com.example.mylivedemo.ui.fragment.RichFragment;
import com.example.mylivedemo.ui.fragment.SupperStartFragment;
import com.example.mylivedemo.ui.fragment.WeekStartFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class RankActivity extends AppCompatActivity {

    private ImageView back_btn;
    private TabLayout rank_main_tab;
    private ViewPager rank_main_pager;

    //碎片对象
    private SupperStartFragment supperStartFragment = new SupperStartFragment();
    private RichFragment richFragment = new RichFragment();
    private PopularityFragment popularityFragment = new PopularityFragment();
    private WeekStartFragment weekStartFragment = new WeekStartFragment();

    private ArrayList<BaseFragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
        initView();
    }

    /**
     * 初始化布局方法
     */
    private void initView() {
        back_btn = findViewById(R.id.rank_back_btn);
        rank_main_tab = findViewById(R.id.rank_main_tab);
        rank_main_pager = findViewById(R.id.rank_main_pager);

        //添加进入集合
        fragments.add(supperStartFragment);
        fragments.add(richFragment);
        fragments.add(popularityFragment);
        fragments.add(weekStartFragment);

        //tab名称集合
        ArrayList<String> tabs = new ArrayList<>();
        tabs.add("明星榜");
        tabs.add("富豪榜");
        tabs.add("人气榜");
        tabs.add("周星榜");

        //创建适配器
        RankVpAdapter adapter = new RankVpAdapter(getSupportFragmentManager(), fragments, tabs);
        rank_main_pager.setAdapter(adapter);
        rank_main_tab.setupWithViewPager(rank_main_pager);

        //设置返回点击事件
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
