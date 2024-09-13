package com.example.tmusic;
import android.Manifest;


import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.skin.SkinManager;
import com.gyf.immersionbar.ImmersionBar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity implements IBaseContainer {
    public T mPresenter;
    /**
     * 初始化MVP
     *
     * @return Presenter
     */
    public abstract T initPresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mPresenter = initPresenter();
        // Hide ActionBar if exists
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        initView();
        initData();
        initImmersionBar();
        // 检查是否具有读取外部存储的权限
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            // 如果没有权限，请求权限
            ActivityCompat.requestPermissions((Activity) this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
            return; // 等待权限请求结果后再尝试加载皮肤
        }
        String srcPath = "/sdcard/Download/app-debug.apk";
        String destPath = this.getFilesDir() + "/app-debug.apk";

        //copyFileToInternalStorage(srcPath, destPath);
        loadSkinFromAssets("app-debug.apk");

        //SkinManager.getInstance().loadSkin(destPath);
        initListener();
        if (mPresenter == null) {
            return;
        }
        mPresenter.attach((V) this);
    }
    public void loadSkinFromAssets(String apkFileName) {
        try {
            // 从 assets 中读取 APK 文件
            AssetManager assetManager = this.getAssets();
            InputStream in = assetManager.open(apkFileName); // apkFileName 是放在 assets 中的 APK 文件名

            // 创建目标文件路径，将 APK 保存到内部存储中
            File outFile = new File(this.getFilesDir(), apkFileName); // 保存到内部存储
            OutputStream out = new FileOutputStream(outFile);

            // 将 APK 文件从 assets 中复制到内部存储
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
            Log.d("SkinLoader", "APK 文件已复制到内部存储: " + outFile.getAbsolutePath());

        } catch (IOException e) {
            Log.e("SkinLoader", "读取 assets 中的 APK 文件失败: " + e.getMessage());
            e.printStackTrace();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter == null) {
            return;
        }
        mPresenter.dettach();
    }
    public void initImmersionBar() {
        ImmersionBar.with(this).init();
    }
}
