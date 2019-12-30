package com.example.mylivedemo.ui.adapter;

import android.content.Context;
import android.text.style.LineHeightSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.WithHint;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.HomeEntity;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 16:56
 */
public class HotAdapter extends RecyclerView.Adapter<HotAdapter.HotItemHolder>{

    private Context context;
    private ArrayList<HomeEntity.MessageBean.AnchorsBean> beans;

    public HotAdapter(Context context, ArrayList<HomeEntity.MessageBean.AnchorsBean> beans) {
        this.context = context;
        this.beans = beans;
    }

    @NonNull
    @Override
    public HotItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.live_item, parent, false);
        return new HotItemHolder(view);
    }

    /**
     * 绑定界面数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull HotItemHolder holder, int position) {
        Glide.with(context)
                .load(beans.get(position).getPic51())
                .transition(withCrossFade())
                .apply(new RequestOptions().priority(Priority.HIGH))
                .into(holder.liver_img);
        holder.liver_nick.setText(beans.get(position).getName());
    }

    @Override
    public int getItemCount() {
        if(beans != null) return beans.size();
        return 0;
    }

    static class HotItemHolder extends RecyclerView.ViewHolder{
        ImageView liver_img;
        TextView liver_nick;
        public HotItemHolder(@NonNull View itemView) {
            super(itemView);
            liver_img = itemView.findViewById(R.id.anchor_img);
            liver_nick = itemView.findViewById(R.id.anchor_nick);
        }
    }
}
