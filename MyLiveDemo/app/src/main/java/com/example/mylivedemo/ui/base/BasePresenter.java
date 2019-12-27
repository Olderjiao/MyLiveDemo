package com.example.mylivedemo.ui.base;

import com.example.mylivedemo.mvp.IView;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 11:58
 */
public abstract class BasePresenter <V extends IView>{

    private V view;

    /**
     * 绑定V层
     * @param view
     */
    public void attach(V view) {
        this.view = view;
    }

    /**
     * 与V层解绑
     */
    public void detach() {
        this.view = null;
    }

    /**
     * 提供一个获取view的方法，后面的子类可通过此方法获取V层
     * @return
     */
    public V getView() {
        return this.view;
    }

}
