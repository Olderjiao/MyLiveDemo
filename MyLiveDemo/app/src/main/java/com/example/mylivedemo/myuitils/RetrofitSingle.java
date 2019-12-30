package com.example.mylivedemo.myuitils;

import com.example.mylivedemo.BaseUrl;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.IView;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.presenter.IPresenter;
import com.example.mylivedemo.mvp.view.HomeView;

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

    public IPresenter getIPresenter(HomeModel model, HomeView view){
        return new IPresenter(model, view);
    }
}
