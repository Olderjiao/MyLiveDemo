package com.example.mylivedemo.mvp.model;

import com.example.mylivedemo.Api;
import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.entity.NewPeopleEntity;
import com.example.mylivedemo.myuitils.MyUtils;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;

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
                ob = Observable.fromArray(newPeopleData).flatMap((Function) Functions.identity(),false,1);
                break;
        }

        return ob;
    }


}
