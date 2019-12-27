package com.example.mylivedemo.mvp.presenter;

import android.util.Log;

import com.example.mylivedemo.Api;
import com.example.mylivedemo.ApiDoman;
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

    public void getHomeData(){
        model.HomeData(ApiDoman.API_DOMAN_HOMEDATA)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<T>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(T t) {
                        if(t instanceof HomeEntity){
                            view.onSuccess((HomeEntity)t);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("###","error----请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
