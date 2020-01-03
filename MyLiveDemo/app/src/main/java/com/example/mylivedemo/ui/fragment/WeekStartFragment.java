package com.example.mylivedemo.ui.fragment;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.mylivedemo.R;
import com.example.mylivedemo.ui.adapter.RankChildVpAdapter;
import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 15:04
 */
public class WeekStartFragment extends BaseFragment implements View.OnClickListener {

    private View tab;
    private ViewPager week_vp;

    //控件存储集合
    ArrayList<TextView> tabs = new ArrayList<>();

    private ArrayList<BaseFragment> fragments = new ArrayList<>();

    private TextView now,before;

    @Override
    protected int setLayoutId() {
        return R.layout.weekstart_fragment;
    }

    @Override
    public void initView(View view) {
        tab = view.findViewById(R.id.week_child_iclude);
        week_vp = view.findViewById(R.id.week_child_vp);

        before = tab.findViewById(R.id.before_week_btn);
        before.setOnClickListener(this);
        now = tab.findViewById(R.id.now_week_btn);
        now.setOnClickListener(this);

        tabs.add(now);
        tabs.add(before);

        //进行绑定
        fragments.add(new WeekChildFragment());
        fragments.add(new WeekChildFragment());
        //设置适配器
        RankChildVpAdapter adapter = new RankChildVpAdapter(getChildFragmentManager(), fragments);
        week_vp.setAdapter(adapter);

        //viewpager滑动监听
        week_vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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

    public void setAllTabs(int index){
        for(int i = 0;i < tabs.size();i++){
            tabs.get(i).setTextColor(getResources().getColor(R.color.defaultFontColor));
            if(index == i){
                tabs.get(i).setTextColor(Color.BLACK);
                week_vp.setCurrentItem(i);
            }
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.now_week_btn:
                setAllTabs(0);
                break;
            case R.id.before_week_btn:
                setAllTabs(1);
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
}
