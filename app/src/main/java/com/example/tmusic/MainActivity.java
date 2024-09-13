package com.example.tmusic;

import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.tmusic.presenter.MainPresenter;
import com.example.tmusic.view.MainView;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends BaseActivity<MainView, MainPresenter>{
    private NavHostFragment navHostFragment;
    private NavController navController;
    private BottomNavigationView bottomNavigationView;
    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_main;
    }

    @Override
    public void initView() {
        initFragmentsView();


    }

    private void initFragmentsView() {
        // 获取NavHostFragment
        navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);

        // 获取NavController
        navController = navHostFragment.getNavController();

        // 绑定BottomNavigationView与NavController
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        initNavigationListener();

    }

    private void initNavigationListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.navigation_home){
                    navController.navigate(R.id.homeFragment);
                    return true;
                }else if(item.getItemId()==R.id.navigation_dashboard){
                    navController.navigate(R.id.discoverFragment);
                    return true;
                }
                return false;
            }
        });


    }
}
