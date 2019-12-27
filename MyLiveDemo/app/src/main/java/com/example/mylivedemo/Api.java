package com.example.mylivedemo;

import com.example.mylivedemo.entity.HomeEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:31
 */
public interface Api {

    @GET(BaseUrl.HOME_URL)
    Observable<HomeEntity> getHomeData();

}
