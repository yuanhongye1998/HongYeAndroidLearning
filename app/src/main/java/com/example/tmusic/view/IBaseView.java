package com.example.tmusic.view;


public interface IBaseView {
    /**
     * 展示加载中
     */
    void showProgress();

    /**
     * 隐藏加载中
     */
    void hideProgress();

    /**
     * 显示异常界面
     */
    void showError();

    /**
     * 显示数据为空
     */
    void showEmpty();
}
