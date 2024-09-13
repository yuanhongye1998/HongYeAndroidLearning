package com.example.tmusic.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.skin.SkinManager;
import com.example.tmusic.BaseFragment;
import com.example.tmusic.R;
import com.example.tmusic.presenter.homePresenter.HomePresenter;
import com.example.tmusic.view.home.HomeView;
import com.youth.banner.Banner;

import java.io.File;

public class HomeFragment  extends BaseFragment<HomeView, HomePresenter> {
    private Banner banner;
    private Button button;
    @Override
    public HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
        button=mRootView.findViewById(R.id.change);
        initBanner();
    }

    @Override
    public void initData() {
        Toast.makeText(this.getContext(), "to get", Toast.LENGTH_SHORT).show();
        mPresenter.getHot(50);
    }

    @Override
    public void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String apkFilePath = new File(requireContext().getFilesDir(), "app-debug.apk").getAbsolutePath();
                // 调用 loadSkin() 方法加载保存到内部存储的 APK 文件
                System.out.println("换肤"+apkFilePath);
                SkinManager.getInstance().loadSkin(apkFilePath);
            }
        });

    }

    private void initBanner() {
        banner = mRootView.findViewById(R.id.banner);
        banner.addBannerLifecycleObserver(this);
        //--------------------------简单使用-------------------------------
        //banner.setAdapter(new ImageAdapter())
                //.setIndicator(new CircleIndicator(this));
    }

    @Override
    public void onStop() {
        super.onStop();
        //停止轮播
        banner.stop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        banner.destroy();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}


