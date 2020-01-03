package com.example.mylivedemo.ui.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.PopularityEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 11:51
 */
public class PopularityChildAdapter extends BaseQuickAdapter<PopularityEntity.MessageBean.RankPopularityBean, PopularityChildAdapter.PopularityHolder> {
    private static ArrayList<Integer> levelIcons = new ArrayList<>();
    private List<PopularityEntity.MessageBean.RankPopularityBean> datas;

    //将所有图片添加进入集合 初始化等级图片
    static {
        levelIcons.add(R.mipmap.ic_host_level_2);
        levelIcons.add(R.mipmap.ic_host_level_3);
        levelIcons.add(R.mipmap.ic_host_level_4);
        levelIcons.add(R.mipmap.ic_host_level_5);
        levelIcons.add(R.mipmap.ic_host_level_6);
        levelIcons.add(R.mipmap.ic_host_level_7);
        levelIcons.add(R.mipmap.ic_host_level_8);
        levelIcons.add(R.mipmap.ic_host_level_9);
        levelIcons.add(R.mipmap.ic_host_level_10);
        levelIcons.add(R.mipmap.ic_host_level_11);
        levelIcons.add(R.mipmap.ic_host_level_12);
        levelIcons.add(R.mipmap.ic_host_level_13);
        levelIcons.add(R.mipmap.ic_host_level_14);
        levelIcons.add(R.mipmap.ic_host_level_15);
        levelIcons.add(R.mipmap.ic_host_level_16);
        levelIcons.add(R.mipmap.ic_host_level_17);
        levelIcons.add(R.mipmap.ic_host_level_18);
        levelIcons.add(R.mipmap.ic_host_level_19);
        levelIcons.add(R.mipmap.ic_host_level_20);
        levelIcons.add(R.mipmap.ic_host_level_21);
        levelIcons.add(R.mipmap.ic_host_level_22);
        levelIcons.add(R.mipmap.ic_host_level_23);
        levelIcons.add(R.mipmap.ic_host_level_24);
        levelIcons.add(R.mipmap.ic_host_level_25);
        levelIcons.add(R.mipmap.ic_host_level_26);
        levelIcons.add(R.mipmap.ic_host_level_27);
        levelIcons.add(R.mipmap.ic_host_level_28);
        levelIcons.add(R.mipmap.ic_host_level_29);
        levelIcons.add(R.mipmap.ic_host_level_30);
        levelIcons.add(R.mipmap.ic_host_level_31);
        levelIcons.add(R.mipmap.ic_host_level_32);
        levelIcons.add(R.mipmap.ic_host_level_33);
        levelIcons.add(R.mipmap.ic_host_level_34);
        levelIcons.add(R.mipmap.ic_host_level_35);
        levelIcons.add(R.mipmap.ic_host_level_36);
        levelIcons.add(R.mipmap.ic_host_level_37);
        levelIcons.add(R.mipmap.ic_host_level_38);
        levelIcons.add(R.mipmap.ic_host_level_39);
        levelIcons.add(R.mipmap.ic_host_level_40);
        levelIcons.add(R.mipmap.ic_host_level_41);
        levelIcons.add(R.mipmap.ic_host_level_42);
        levelIcons.add(R.mipmap.ic_host_level_43);
        levelIcons.add(R.mipmap.ic_host_level_44);
        levelIcons.add(R.mipmap.ic_host_level_45);
    }

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId The layout resource id of each item.
     * @param data        A new list is created out of this one to avoid mutable list
     */
    public PopularityChildAdapter(int layoutResId, @Nullable List<PopularityEntity.MessageBean.RankPopularityBean> data) {
        super(layoutResId, data);
        this.datas = data;
    }

    /**
     * Implement this method and use the helper to adapt the view to the given item.
     *
     * @param helper A fully initialized helper.
     * @param item   The item that needs to be displayed.
     */
    @Override
    protected void convert(PopularityHolder helper, PopularityEntity.MessageBean.RankPopularityBean item) {

    }

    @Override
    public void onBindViewHolder(PopularityHolder holder, int position) {
        super.onBindViewHolder(holder, position);

        //取出等级图片
        for(int i = 1;i <= levelIcons.size();i++){
            if(datas.get(position).getLevel()-1 == i){
                Glide.with(mContext)
                        .load(levelIcons.get(i))
                        .into((ImageView)holder.getView(R.id.level_img));
            }
        }

        //判断是否在直播
        if(datas.get(position).getIsInLive() == 1){
            holder.getView(R.id.rank_isshow_live).setVisibility(View.VISIBLE);
        }

        //进行数据绑定
        if(position == 0){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_1).into((ImageView)holder.getView(R.id.rank_img));
            //设置前三名头像
            Glide.with(mContext)
                    .load(datas.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,datas.get(position).getNickname());
        }else if(position == 1){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_2).into((ImageView)holder.getView(R.id.rank_img));
            //设置头像
            Glide.with(mContext)
                    .load(datas.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,datas.get(position).getNickname());
        }else if(position == 2){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_3).into((ImageView)holder.getView(R.id.rank_img));
            //设置头像
            Glide.with(mContext)
                    .load(datas.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,datas.get(position).getNickname());
        }else {

            holder.setText(R.id.rank_txt,""+(position+1));
            //隐藏前三名排名
            holder.getView(R.id.rank_img).setVisibility(View.GONE);
            //显示数字排名
            holder.getView(R.id.rank_txt).setVisibility(View.VISIBLE);
            //设置头像
            Glide.with(mContext)
                    .load(datas.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(90,90))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,datas.get(position).getNickname());
        }

    }

    static class PopularityHolder extends BaseViewHolder {

        public PopularityHolder(View view) {
            super(view);
        }
    }

}
