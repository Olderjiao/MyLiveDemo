package com.example.mylivedemo.myuitils;

import android.content.Context;
import android.widget.Toast;

import retrofit2.Retrofit;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 10:28
 */
public class MyUtils {
    /**
     * 显示吐司提示
     * @param context
     * @param msg
     */
    public static void showToast(Context context,String msg){
        Toast.makeText(context.getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    /**
     * 获取网络请求
     * @return Retrofit
     */
    public static Retrofit getRetrofit(){
        return RetrofitSingle.getInstance().getRetrofit();
    }

}
