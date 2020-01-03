package com.example.mylivedemo.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mylivedemo.ui.base.BaseFragment;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 15:00
 */
public class RankVpAdapter extends FragmentPagerAdapter {

    private ArrayList<BaseFragment> fragments;
    private ArrayList<String> titles;

    public RankVpAdapter(@NonNull FragmentManager fm, ArrayList<BaseFragment> fragments, ArrayList<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(fragments == null) return null;
        return fragments.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        if(fragments != null) return fragments.size();
        return 0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(titles != null){
            return titles.get(position);
        }
        return super.getPageTitle(position);
    }
}
