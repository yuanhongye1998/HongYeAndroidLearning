package com.example.tmusic;


/**
 * @author : monsterlin
 * @date : 2020/4/9 4:14 PM
 * desc : BaseView
 */
public interface IBaseContainer {
    /**
     * 获取布局
     *
     * @return 布局Id
     */
    int getLayoutId();

    /**
     * 初始化视图
     */
    void initView();

    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化监听器
     */
    void initListener();
}
