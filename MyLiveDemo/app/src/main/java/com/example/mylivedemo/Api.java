package com.example.mylivedemo;

import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.entity.NewPeopleEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:31
 */
public interface Api {
    /**
     * 主页数据
     * @return
     */
    @GET(BaseUrl.HOME_URL)
    Observable<HomeEntity> getHomeData();

    @GET(BaseUrl.ATTENTION_URL)
    Observable<AttentionEntity> getAttentionData();

    @GET(BaseUrl.NEWPEOPLE_URL)
    Observable<NewPeopleEntity> getNewPeopleData();
}
