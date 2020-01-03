package com.example.mylivedemo.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mylivedemo.ui.base.BaseFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 18:48
 */
public class RankChildVpAdapter extends FragmentPagerAdapter {
    private ArrayList<BaseFragment> fragments;

    public RankChildVpAdapter(@NonNull FragmentManager fm, ArrayList<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments != null) return fragments.get(position);
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        if(fragments != null) return fragments.size();
        return 0;
    }
}
