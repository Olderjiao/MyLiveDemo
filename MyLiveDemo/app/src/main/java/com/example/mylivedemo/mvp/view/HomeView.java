package com.example.mylivedemo.mvp.view;

import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.mvp.IView;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 15:53
 */
public interface HomeView<T> extends IView {

    void onSuccess(BaseEntity baseEntity);
    void onError(Throwable throwable);
}
