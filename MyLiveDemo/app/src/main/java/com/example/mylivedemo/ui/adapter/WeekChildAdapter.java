package com.example.mylivedemo.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.WeekEntity;

import java.util.ArrayList;

import retrofit2.http.HEAD;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/2 14:02
 */
public class WeekChildAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final int HEAD_TXT = 0;
    private static final int CONTENT_TXT = 1;
    private static int flag = 0;

    private static ArrayList<Integer> levelIcons = new ArrayList<>();
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

    private Context context;
    private ArrayList<WeekEntity> datas = new ArrayList<>();

    public WeekChildAdapter(ArrayList<WeekEntity> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == HEAD_TXT){
            View head = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.week_head, parent, false);
            return new WeekHeadHolder(head);
        }
        View content = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.week_content, parent, false);
        return new WeekContentHolder(content);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof WeekHeadHolder){
            WeekHeadHolder headHolder = (WeekHeadHolder)holder;
            if(position == 0){
                headHolder.head.setText("主播周星榜");
            }else{
                headHolder.head.setText("富豪周星榜");
            }

        }else{
            WeekContentHolder contentHolder = (WeekContentHolder) holder;
            //设置粉丝排行榜信息
            if(position >= datas.get(0).getMessage().getAnchorRank().size()+2){
                WeekEntity.MessageBean.FansRankBean fansRankBean = datas.get(0).getMessage().getFansRank().get(position-9);
                //设置加载礼物图片
                Glide.with(context).load(fansRankBean.getGiftAppImg()).into(contentHolder.gift_img);
                contentHolder.gift_name.setText(fansRankBean.getGiftName());//礼物名称
                contentHolder.gift_num.setText("本周获得 ×"+fansRankBean.getGiftNum()+"个");//礼物数量
                Glide.with(context).load(level_icon.get(fansRankBean.getLevel()-1)).into(contentHolder.level_img);//主播等级
                contentHolder.nick.setText(fansRankBean.getNickname());//主播昵称
            }else{
                //设置主播信息内容
                WeekEntity.MessageBean.AnchorRankBean anchorRankBean = datas.get(0).getMessage().getAnchorRank().get(position-1);
                //设置加载礼物图片
                Glide.with(context).load(anchorRankBean.getGiftAppImg()).into(contentHolder.gift_img);
                contentHolder.gift_name.setText(anchorRankBean.getGiftName());//礼物名称
                contentHolder.gift_num.setText("本周获得 ×"+anchorRankBean.getGiftNum()+"个");//礼物数量
                Glide.with(context).load(levelIcons.get(anchorRankBean.getLevel()-1)).into(contentHolder.level_img);//主播等级
                contentHolder.nick.setText(anchorRankBean.getNickname());//主播昵称
                //判断是否在直播
                if(anchorRankBean.getStatusInLive() == 1){
                    contentHolder.is_show.setVisibility(View.VISIBLE);
                }else{
                    contentHolder.is_show.setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(datas == null || datas.size() == 0){
            return -1;
        }
        if(position == 0){
            return HEAD_TXT;
        }else if(position == datas.get(0).getMessage().getAnchorRank().size()+1){
            return HEAD_TXT;
        }
        return CONTENT_TXT;
    }

    @Override
    public int getItemCount() {
        if(datas != null && datas.size() != 0){
            int size = datas.get(0).getMessage().getAnchorRank().size() + datas.get(0).getMessage().getFansRank().size() + 2;
            Log.e("###size",size+"");
            return size;
        }
        return 0;
    }

    static class WeekHeadHolder extends RecyclerView.ViewHolder {
        TextView head;
        public WeekHeadHolder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.week_head_txt);
        }
    }

    static class WeekContentHolder extends RecyclerView.ViewHolder{
        ImageView gift_img,level_img,is_show;
        TextView nick,gift_num,gift_name;
        public WeekContentHolder(@NonNull View itemView) {
            super(itemView);
            //获取控件ID
            gift_img = itemView.findViewById(R.id.week_rank_gift_img);
            level_img = itemView.findViewById(R.id.week_level_img);
            is_show = itemView.findViewById(R.id.week_is_show);

            nick = itemView.findViewById(R.id.week_liver_name);
            gift_name = itemView.findViewById(R.id.week_gift_name);
            gift_num = itemView.findViewById(R.id.week_gift_count);

        }
    }

}
