package com.example.mylivedemo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mylivedemo.R;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/28 9:15
 */
public class FragmentSpot extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.spot_fragment, container, false);
        initView(view);
        return view;
    }

    /**
     * 初始化布局控件
     * @param view
     */
    private void initView(View view) {

    }
}
