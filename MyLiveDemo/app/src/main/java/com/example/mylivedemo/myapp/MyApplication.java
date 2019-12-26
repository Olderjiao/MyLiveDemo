package com.example.mylivedemo.myapp;

import android.app.Application;

import com.tencent.rtmp.TXLiveBase;

/**
 * @author: create by OlderJiao
 * @date: 2019 2019/12/24 14:48
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String licenceURL = "http://license.vod2.myqcloud.com/license/v1/d33a2cf9363ec244fb4335781785e44c/TXLiveSDK.licence"; // 获取到的 licence url
        String licenceKey = "16ee7d09a6517ee5597dbc47c68d3f2b"; // 获取到的 licence key
        TXLiveBase.getInstance().setLicence(this, licenceURL, licenceKey);
    }

}
