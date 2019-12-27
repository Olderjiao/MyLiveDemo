package com.example.mylivedemo.ui.adapter;

import android.view.View;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.mylivedemo.entity.HomeEntity;

import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 16:56
 */
public class AttentionAdapter extends BaseQuickAdapter<HomeEntity.MessageBean.AnchorsBean, AttentionAdapter.LiveRoomHolder> {


    public AttentionAdapter(int layoutResId, @Nullable List<HomeEntity.MessageBean.AnchorsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(LiveRoomHolder helper, HomeEntity.MessageBean.AnchorsBean item) {

    }

    public class LiveRoomHolder extends BaseViewHolder{

        public LiveRoomHolder(View view) {
            super(view);
        }
    }

}
