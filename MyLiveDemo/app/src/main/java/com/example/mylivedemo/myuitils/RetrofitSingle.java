package com.example.mylivedemo.myuitils;

import com.example.mylivedemo.BaseUrl;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:00
 */
public class RetrofitSingle {

    private static RetrofitSingle retrofitSingle;

    private RetrofitSingle(){}

    public static RetrofitSingle getInstance(){
        if(retrofitSingle == null){
            retrofitSingle = new RetrofitSingle();
        }
        return retrofitSingle;
    }

    public Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        return retrofit;
    }

}
