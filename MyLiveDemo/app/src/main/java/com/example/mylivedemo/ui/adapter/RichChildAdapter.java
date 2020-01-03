package com.example.mylivedemo.ui.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.RichRankEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 9:30
 */
public class RichChildAdapter extends BaseQuickAdapter<RichRankEntity.MessageBean.RankWealthBean, RichChildAdapter.RichChildHolder> {

    private static ArrayList<Integer> level_icon = new ArrayList<>();
    static {
        level_icon.add(R.mipmap.level_1);
        level_icon.add(R.mipmap.level_2);
        level_icon.add(R.mipmap.level_3);
        level_icon.add(R.mipmap.level_4);
        level_icon.add(R.mipmap.level_5);
        level_icon.add(R.mipmap.level_6);
        level_icon.add(R.mipmap.level_7);
        level_icon.add(R.mipmap.level_8);
        level_icon.add(R.mipmap.level_9);
        level_icon.add(R.mipmap.level_10);
        level_icon.add(R.mipmap.level_11);
        level_icon.add(R.mipmap.level_12);
        level_icon.add(R.mipmap.level_13);
        level_icon.add(R.mipmap.level_14);
        level_icon.add(R.mipmap.level_15);
        level_icon.add(R.mipmap.level_16);
        level_icon.add(R.mipmap.level_17);
        level_icon.add(R.mipmap.level_18);
        level_icon.add(R.mipmap.level_19);
        level_icon.add(R.mipmap.level_20);
        level_icon.add(R.mipmap.level_21);
        level_icon.add(R.mipmap.level_22);
        level_icon.add(R.mipmap.level_23);
        level_icon.add(R.mipmap.level_24);
        level_icon.add(R.mipmap.level_25);
        level_icon.add(R.mipmap.level_26);
        level_icon.add(R.mipmap.level_27);
        level_icon.add(R.mipmap.level_28);
        level_icon.add(R.mipmap.level_29);
        level_icon.add(R.mipmap.level_30);
        level_icon.add(R.mipmap.level_31);
        level_icon.add(R.mipmap.level_32);
        level_icon.add(R.mipmap.level_33);
        level_icon.add(R.mipmap.level_34);
        level_icon.add(R.mipmap.level_35);
        level_icon.add(R.mipmap.level_36);
        level_icon.add(R.mipmap.level_37);
        level_icon.add(R.mipmap.level_38);
        level_icon.add(R.mipmap.level_39);
        level_icon.add(R.mipmap.level_40);
        level_icon.add(R.mipmap.level_41);
        level_icon.add(R.mipmap.level_42);
        level_icon.add(R.mipmap.level_43);
    }

    //数据集合
    private List<RichRankEntity.MessageBean.RankWealthBean> beans;

    public RichChildAdapter(int layoutResId, @Nullable List<RichRankEntity.MessageBean.RankWealthBean> data) {
        super(layoutResId, data);
        this.beans = data;
    }

    @Override
    protected void convert(RichChildHolder helper, RichRankEntity.MessageBean.RankWealthBean item) {

    }

    @Override
    public void onBindViewHolder(RichChildHolder holder, int position) {
        super.onBindViewHolder(holder, position);
//取出等级图片
        for(int i = 0;i < level_icon.size();i++){
            if(beans.get(position).getLevel() == i){
                Glide.with(mContext)
                        .load(level_icon.get(i))
                        .into((ImageView)holder.getView(R.id.level_img));
            }
        }

        //进行数据绑定
        if(position == 0){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_1).into((ImageView)holder.getView(R.id.rank_img));
            //设置前三名头像
            Glide.with(mContext)
                    .load(beans.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,beans.get(position).getNickname());
        }else if(position == 1){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_2).into((ImageView)holder.getView(R.id.rank_img));
            //设置头像
            Glide.with(mContext)
                    .load(beans.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,beans.get(position).getNickname());
        }else if(position == 2){
            holder.getView(R.id.rank_txt).setVisibility(View.GONE);
            holder.getView(R.id.rank_img).setVisibility(View.VISIBLE);
            Glide.with(mContext).load(R.mipmap.ic_contribution_3).into((ImageView)holder.getView(R.id.rank_img));
            //设置头像
            Glide.with(mContext)
                    .load(beans.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(100,100))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,beans.get(position).getNickname());
        }else {

            holder.setText(R.id.rank_txt,""+(position+1));
            //隐藏前三名排名
            holder.getView(R.id.rank_img).setVisibility(View.GONE);
            //显示数字排名
            holder.getView(R.id.rank_txt).setVisibility(View.VISIBLE);
            //设置头像
            Glide.with(mContext)
                    .load(beans.get(position).getAvatar())
                    .apply(new RequestOptions().circleCrop())
                    .apply(new RequestOptions().override(90,90))
                    .into((ImageView) holder.getView(R.id.rank_anthor_head));
            //设置昵称
            holder.setText(R.id.rank_nick,beans.get(position).getNickname());
        }

    }

    static class RichChildHolder extends BaseViewHolder {

        public RichChildHolder(View view) {
            super(view);
        }
    }
}
