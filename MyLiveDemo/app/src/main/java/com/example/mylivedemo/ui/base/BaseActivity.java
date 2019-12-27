package com.example.mylivedemo.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mylivedemo.mvp.IView;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/27 13:58
 */
public abstract class BaseActivity <V extends IView,P extends BasePresenter<V>> extends AppCompatActivity implements IView{

    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(presenter == null){
            presenter = createPresenter();
        }
        //如果对象为空 则抛出异常
        if(presenter == null){
            throw new NullPointerException("presendter不可以为空");
        }
        presenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.detach();
        }
    }

    /**
     * 对子类提供获取presenter的方法
     * @return
     */
    public P getPresenter() {
        return presenter;
    }

    /**
     * 创建presenter，让子类自己去实现，获取自己的presenter
     * @return
     */
    protected abstract P createPresenter();

}
