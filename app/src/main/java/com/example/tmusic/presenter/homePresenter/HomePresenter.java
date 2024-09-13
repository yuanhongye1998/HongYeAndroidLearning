package com.example.tmusic.presenter.homePresenter;

import com.example.tmusic.BasePresenter;
import com.example.tmusic.bean.TopBean;
import com.example.tmusic.http.HttpHelper;
import com.example.tmusic.view.home.HomeView;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class HomePresenter extends BasePresenter<HomeView> {
    public static final String  type="Douban";
    public static final Integer skip=0;
    public static final String  lang="Cn";
    //example:https://api.wmdb.tv/api/v1/top?type=Douban&skip=0&limit=50&lang=Cn
    public void getHot(Integer limit) {
        HttpHelper.getHot(type, skip, limit, lang, new Observer<List<TopBean>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<TopBean> topBeans) {

                System.out.println("get===========success"+topBeans.get(0).getData().get(0).getPoster());


            }

            @Override
            public void onError(Throwable e) {
                System.out.println("get===========success"+e.getMessage());

            }

            @Override
            public void onComplete() {

            }
        });
    }

}
