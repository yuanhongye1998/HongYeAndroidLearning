package com.example.tmusic.http.api;




import com.example.tmusic.bean.MovieInfoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

// 定义一个接口来描述你的 API 请求
public interface MovieService {
    @GET("api/v1/movie/search")
    Observable<MovieInfoBean> searchMovies(
            @Query("q") String query, // 必需的查询参数
            @Query("limit") Integer limit, // 可选参数，使用包装类 Integer 以便为 null
            @Query("skip") Integer skip, // 可选参数，使用包装类 Integer 以便为 null
            @Query("lang") String lang, // 可选参数
            @Query("year") Integer year // 可选参数，使用包装类 Integer 以便为 null
    );
}
