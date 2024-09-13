package com.example.tmusic.http;




import com.example.tmusic.bean.MovieInfoBean;
import com.example.tmusic.bean.TopBean;
import com.example.tmusic.http.api.MovieService;
import com.example.tmusic.http.api.TopHotService;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import utils.RetrofitUtils;


public class HttpHelper {
    //搜索电影
    public static void Searchinfo(String name, Integer limit, Integer skip, String lang, Integer year, Observer<MovieInfoBean> observer){
        RetrofitUtils.get().create(MovieService.class).searchMovies(name,limit,skip,lang,year)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
    public static void getHot(String type, Integer skip, Integer limit, String lang,Observer<List<TopBean>> observer){
        RetrofitUtils.get().create(TopHotService.class).getTopMovies(type,skip,limit,lang).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

}
