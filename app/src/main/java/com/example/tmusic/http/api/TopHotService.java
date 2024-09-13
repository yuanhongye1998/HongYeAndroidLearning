package com.example.tmusic.http.api;


import com.example.tmusic.bean.TopBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TopHotService {
    @GET("api/v1/top")
    Observable<List<TopBean>> getTopMovies(
            @Query("type") String type,
            @Query("skip") Integer skip,  // 必需的查询参数
            @Query("limit") Integer limit,// 可选参数，使用包装类 Integer 以便为 null
            @Query("lang") String lang);   // 可选参数
}
