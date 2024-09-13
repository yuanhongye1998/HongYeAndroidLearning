package com.example.tmusic;


import androidx.annotation.NonNull;

import java.lang.reflect.Proxy;

/**
 * @author : hongye yuan
 * @date : 2024/7/13 6:18 PM
 * desc : BasePresenter
 */
public abstract class BasePresenter<T> {
    public T mView, mProxyView;

    public void attach(@NonNull T mView) {
        this.mView = mView;
        mProxyView = (T) Proxy.newProxyInstance(mView.getClass().getClassLoader(),
                mView.getClass().getInterfaces(), (proxy, method, args) -> {
                    if (mView == null) {
                        return null;
                    }
                    return method.invoke(mView, args);
                });
    }

    public void dettach() {
        mView = null;
    }

    /**
     * 对外提供View对象
     *
     * @return
     */
    public T getView() {
        return mProxyView;
    }
}
