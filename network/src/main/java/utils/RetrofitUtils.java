package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    /*
    Base URL for API requests.
    */
    private String baseUrl = "https://api.wmdb.tv/";

    private static final RetrofitUtils retrofitUtils = new RetrofitUtils();

    public static RetrofitUtils get(){
        return retrofitUtils;
    }

    private static volatile Retrofit retrofit;

    // Constructor
    public RetrofitUtils(){
        // Create a Retrofit builder
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()));

        // OkHttpClient Builder
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS) // Set connection timeout
                .readTimeout(30, TimeUnit.SECONDS) // Set read timeout
                .writeTimeout(30, TimeUnit.SECONDS); // Set write timeout

        // Add custom interceptor for adding headers
//        builder.addInterceptor(new Interceptor() {
//            @Override
//            public Response intercept(Chain chain) throws IOException {
//                Request.Builder request = chain.request().newBuilder();
//                request.addHeader("Accept", "*/*"); // Adding custom header
//                return chain.proceed(request.build());
//            }
//        });

        // Add logging interceptor
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                // Replace this with any logging library you are using, such as Timber or Logcat.
                System.out.println("OkHttp Log: " + message); // You can replace with Logger or Log.d
            }
        }).setLevel(HttpLoggingInterceptor.Level.BODY); // Log the body of request/response
        builder.addInterceptor(loggingInterceptor);

        // Build Retrofit instance
        retrofit = retrofitBuilder.client(builder.build()).build();
    }

    // Create Retrofit service
    public static <T> T create(Class<T> cls) {
        return retrofit.create(cls);
    }
}
