package com.example.tmusic;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gyf.immersionbar.ImmersionBar;



/**
 * @author : hongye yuan
 * @date : 2024/7/2 2:25 PM
 * desc : 懒加载Fragment
 * <p>
 * 此Fragment主要是为了解决懒加载的问题
 * 适用于：首页频道切换，但是数据请求一次不变的情况
 * </p>
 */
public abstract class BaseFragment<V, T extends BasePresenter<V>> extends Fragment implements IBaseContainer {
    /**
     * 根View
     */
    protected View mRootView;


    protected T mPresenter;

    /**
     * 初始化MVP
     *
     * @return Presenter
     */
    public abstract T initPresenter();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresenter();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mPresenter == null) {
            return;
        }
        mPresenter.attach((V) this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter == null) {
            return;
        }
        mPresenter.dettach();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(getLayoutId(), container, false);
        } else {
            ViewGroup viewGroup = (ViewGroup) mRootView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(mRootView);
            }
        }
        initView();
        initData();
        initListener();
        initImmersionBar();

        return mRootView;
    }





    public void initImmersionBar() {
        ImmersionBar.with(this).transparentBar().statusBarDarkFont(true).init();
    }




}
