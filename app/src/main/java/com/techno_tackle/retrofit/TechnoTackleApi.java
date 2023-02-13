package com.techno_tackle.retrofit;

import android.util.Log;


import com.github.ybq.android.spinkit.BuildConfig;
import com.techno_tackle.utills.Constants;
import com.techno_tackle.utills.PreferenceManager;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TechnoTackleApi {

    private static Retrofit retrofit = null;

    public static TechnoTackleInterface getMatrixClient(){

        String BASE_URL = "https://www.jesta.clinic/admin/web/v1/users/";

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder().connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120,TimeUnit.SECONDS)
                .writeTimeout(120,TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

        if(BuildConfig.DEBUG){
            interceptor.level(HttpLoggingInterceptor.Level.BODY);
        }else{
            interceptor.level(HttpLoggingInterceptor.Level.NONE);
        }
        httpClient.addInterceptor(interceptor);

        httpClient.addInterceptor(new Interceptor() {
            @NotNull
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder();

               String token= PreferenceManager.getString(Constants.TOKEN,"");

                if(token != null){
                    Log.d("RetrofitClient", "intercept: "+"Bearer"+token);
                    requestBuilder.addHeader("Authorization", "Bearer"+" "+token);
                }
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        TechnoTackleInterface api = retrofit.create(TechnoTackleInterface.class);
        return api;
    }

}
