package com.example.tmusic;

import android.app.Application;

import com.example.skin.SkinManager;

import utils.RetrofitUtils;


public class MusicApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitUtils.get();
        SkinManager.init(this);
    }
}
