package com.example.mylivedemo.ui.fragment;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.example.mylivedemo.R;
import com.example.mylivedemo.ui.adapter.RankChildVpAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 15:04
 */
public class PopularityFragment extends BaseFragment implements View.OnClickListener {

    private View tab;
    private ViewPager popu_vp;

    private TextView day_tab,week_tab,month_tab,all_tab;

    //fragment集合
    ArrayList<BaseFragment> fragments = new ArrayList<>();

    //控件存储集合
    ArrayList<TextView> tabs = new ArrayList<>();

    @Override
    protected int setLayoutId() {
        return R.layout.popularity_fragment;
    }

    @Override
    public void initView(View view) {

        tab = view.findViewById(R.id.popularity_child_iclude);
        popu_vp = view.findViewById(R.id.popularity_child_vp);

        day_tab = tab.findViewById(R.id.day_btn);
        day_tab.setOnClickListener(this);
        week_tab = tab.findViewById(R.id.week_btn);
        week_tab.setOnClickListener(this);
        month_tab = tab.findViewById(R.id.month_btn);
        month_tab.setOnClickListener(this);
        all_tab = tab.findViewById(R.id.all_btn);
        all_tab.setOnClickListener(this);

        tabs.add(day_tab);
        tabs.add(week_tab);
        tabs.add(month_tab);
        tabs.add(all_tab);

        fragments.add(new PopularityChildFragment(1));
        fragments.add(new PopularityChildFragment(2));
        fragments.add(new PopularityChildFragment(3));
        fragments.add(new PopularityChildFragment(4));

        //创建适配器
        RankChildVpAdapter adapter = new RankChildVpAdapter(getChildFragmentManager(), fragments);
        popu_vp.setAdapter(adapter);

        //viewpager滑动监听
        popu_vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setAllTabs(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.day_btn:
//                Log.e("###","日排行");
                setAllTabs(0);
                break;
            case R.id.week_btn:
//                Log.e("###","周排行");
                setAllTabs(1);
                break;
            case R.id.month_btn:
//                Log.e("###","月排行");
                setAllTabs(2);
                break;
            case R.id.all_btn:
//                Log.e("###","总排行");
                setAllTabs(3);
                break;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        //初始化控件集合
        fragments.clear();
        tabs.clear();
    }


    public void setAllTabs(int index){
        for(int i = 0;i < tabs.size();i++){
            tabs.get(i).setTextColor(getResources().getColor(R.color.defaultFontColor));
            if(index == i){
                tabs.get(i).setTextColor(Color.BLACK);
                popu_vp.setCurrentItem(i);
            }
        }
    }

}
