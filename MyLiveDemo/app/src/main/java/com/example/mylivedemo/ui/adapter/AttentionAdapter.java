package com.example.mylivedemo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.AttentionEntity;

import java.util.ArrayList;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/28 10:48
 */
public class AttentionAdapter extends RecyclerView.Adapter<AttentionAdapter.AttentionHolder>{

    private Context context;
    private ArrayList<AttentionEntity.DataBean.AnchorsBean> datas;

    public AttentionAdapter(Context context, ArrayList<AttentionEntity.DataBean.AnchorsBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public AttentionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.atten_recyc_layout, parent, false);
        return new AttentionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttentionHolder holder, int position) {
        //进行数据绑定
        Glide.with(context)
                .load(datas.get(position).getPic())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(holder.head_img);
        holder.ahtor_name.setText(datas.get(position).getNickname());
    }

    @Override
    public int getItemCount() {
        if(datas != null){
            return datas.size();
        }
        return 0;
    }

    class AttentionHolder extends RecyclerView.ViewHolder{

        ImageView head_img;
        TextView ahtor_name;
        Button atten_btn;

        public AttentionHolder(@NonNull View itemView) {
            super(itemView);
            head_img = itemView.findViewById(R.id.atten_head_img);
            ahtor_name = itemView.findViewById(R.id.atten_ahtor_name);
            atten_btn = itemView.findViewById(R.id.atten_btn);
        }
    }
}
