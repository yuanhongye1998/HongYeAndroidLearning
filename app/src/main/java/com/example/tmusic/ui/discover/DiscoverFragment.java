package com.example.tmusic.ui.discover;

import com.example.tmusic.BaseFragment;
import com.example.tmusic.R;
import com.example.tmusic.presenter.discoverpresenter.DiscoverPresenter;
import com.example.tmusic.view.discover.DiscoverView;

public class DiscoverFragment  extends BaseFragment<DiscoverView, DiscoverPresenter>{
    @Override
    public DiscoverPresenter initPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_discover;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }
}
