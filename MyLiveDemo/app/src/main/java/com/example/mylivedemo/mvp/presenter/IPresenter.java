package com.example.mylivedemo.mvp.presenter;

import android.util.Log;

import com.example.mylivedemo.Api;
import com.example.mylivedemo.ApiDoman;
import com.example.mylivedemo.entity.AttentionEntity;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.HomeEntity;
import com.example.mylivedemo.mvp.IView;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.ui.base.BasePresenter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 15:50
 */
public class IPresenter<T> extends BasePresenter<HomeView> {

    private HomeView view;
    private HomeModel<T> model;

    public IPresenter(HomeModel model,HomeView view) {
        this.model = model;
        this.view = view;
    }

    public void getHomeData(final int type){
        model.HomeData(type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseEntity baseEntity) {
                        if(type == ApiDoman.API_DOMAN_ATTENTIONDATA){
                            view.onSuccess(baseEntity);
                        }else if(type == ApiDoman.API_DOMAN_HOMEDATA){
                            view.onSuccess(baseEntity);
                        }else if(type == ApiDoman.API_DOMAN_NEWPEOPLEDATA){
                            view.onSuccess(baseEntity);
                        }else if(type == ApiDoman.API_WEEK_RANK){
                            view.onSuccess(baseEntity);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void  getRankData(final int type, int pageSize, int rank_type){
        model.HomeData(type,pageSize,rank_type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseEntity baseEntity) {
                        if(type == ApiDoman.API_DOMAN_RANK_START){
                            view.onSuccess(baseEntity);
                        }else if(type == ApiDoman.API_DOMAN_RANK_RICH){
                            view.onSuccess(baseEntity);
                        }else if(type == ApiDoman.API_POPULARITY_RANK){
                            view.onSuccess(baseEntity);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
