package com.example.mylivedemo.mvp.model;

import com.example.mylivedemo.Api;
import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.entity.LiveEntity;
import com.example.mylivedemo.entity.NewPeopleEntity;
import com.example.mylivedemo.entity.PopularityEntity;
import com.example.mylivedemo.entity.RichRankEntity;
import com.example.mylivedemo.entity.StartRankEntity;
import com.example.mylivedemo.entity.WeekEntity;
import com.example.mylivedemo.myuitils.MyUtils;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 14:41
 */
public class HomeModel<T> {

    private T baseEntity;

    public Observable<BaseEntity> HomeData(int type) {

        Observable<BaseEntity> ob = null;

        switch (type) {
            case ApiDoman.API_DOMAN_HOMEDATA:

                Observable<HomeEntity> homeData = MyUtils.getRetrofit().create(Api.class)
                        .getHomeData();

                ob = Observable.fromArray(homeData).flatMap((Function) Functions.identity(), false, 1);
                break;
            case ApiDoman.API_DOMAN_ATTENTIONDATA:
                Observable<AttentionEntity> attentionData = MyUtils.getRetrofit()
                        .create(Api.class)
                        .getAttentionData();
                ob = Observable.fromArray(attentionData).flatMap((Function) Functions.identity(), false, 1);
                break;
            case ApiDoman.API_DOMAN_NEWPEOPLEDATA:
                Observable<NewPeopleEntity> newPeopleData = MyUtils
                        .getRetrofit().create(Api.class)
                        .getNewPeopleData();
                ob = Observable.fromArray(newPeopleData).flatMap((Function) Functions.identity(), false, 1);
                break;
            case ApiDoman.API_WEEK_RANK:
                Observable<WeekEntity> weekEntityObservable = MyUtils
                        .getRetrofit().create(Api.class)
                        .getWeekRankData();
                ob = Observable.fromArray(weekEntityObservable).flatMap((Function) Functions.identity(), false, 1);
                break;
        }
        return ob;
    }

    public Observable<BaseEntity> HomeData(int type, int pageSize, int rank_type) {
        Observable<BaseEntity> ob = null;
        switch (type) {
            case ApiDoman.API_DOMAN_RANK_START:
                Observable<StartRankEntity> rankData = MyUtils.getRetrofit().create(Api.class)
                        .getRankData(pageSize + "", rank_type + "");
                ob = Observable.fromArray(rankData).flatMap((Function) Functions.identity(), false, 1);
                break;
            case ApiDoman.API_DOMAN_RANK_RICH:
                Observable<RichRankEntity> richRankEntityObservable = MyUtils.getRetrofit()
                        .create(Api.class)
                        .getRichRankData(pageSize + "", rank_type + "");
                ob = Observable.fromArray(richRankEntityObservable).flatMap((Function) Functions.identity(), false, 1);
                break;
            case ApiDoman.API_POPULARITY_RANK:
                Observable<PopularityEntity> popularityData = MyUtils.getRetrofit()
                        .create(Api.class)
                        .getPopularityData(pageSize + "", rank_type + "");
                ob = Observable.fromArray(popularityData).flatMap((Function) Functions.identity(), false, 1);
                break;
        }
        return ob;
    }
    /**
     * 获取直播流数据方法
     */
    public Observable<BaseEntity> getLiveData(String roomId){
        Observable<BaseEntity> ob = null;
        Observable<LiveEntity> liveData = MyUtils.getRetrofit()
                .create(Api.class)
                .getLiveData(roomId);
        ob = Observable.fromArray(liveData).flatMap((Function) Functions.identity(), false, 1);
        return ob;
    }
}
