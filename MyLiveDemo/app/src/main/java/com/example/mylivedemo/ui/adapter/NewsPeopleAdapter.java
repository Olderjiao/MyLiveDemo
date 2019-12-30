package com.example.mylivedemo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.NewPeopleEntity;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/30 11:26
 */
public class NewsPeopleAdapter extends RecyclerView.Adapter<NewsPeopleAdapter.NewPeolpleHolder>{

    private Context context;
    private ArrayList<NewPeopleEntity.MessageBean.AnchorsBean> beans;

    public NewsPeopleAdapter(Context context, ArrayList<NewPeopleEntity.MessageBean.AnchorsBean> beans) {
        this.context = context;
        this.beans = beans;
    }
    @NonNull
    @Override
    public NewPeolpleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.live_item, parent, false);
        return new NewPeolpleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewPeolpleHolder holder, int position) {
        //绑定数据
        Glide.with(context)
                .load(beans.get(position).getPic51())
                .transition(withCrossFade())
                .into(holder.liver_img);
        holder.liver_nick.setText(beans.get(position).getNickname());
    }

    @Override
    public int getItemCount() {
        if(beans != null) return beans.size();
        return 0;
    }

    static class NewPeolpleHolder extends RecyclerView.ViewHolder{
        ImageView liver_img;
        TextView liver_nick;
        public NewPeolpleHolder(@NonNull View itemView) {
            super(itemView);
            liver_img = itemView.findViewById(R.id.anchor_img);
            liver_nick = itemView.findViewById(R.id.anchor_nick);
        }
    }

}
