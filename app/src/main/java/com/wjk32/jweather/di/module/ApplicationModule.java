package com.wjk32.jweather.di.module;

import android.content.Context;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wjk32 on 1/13/2018.
 */

@Module
public class ApplicationModule {

    private String BASE_URL="http://api.openweathermap.org/data/2.5/";
    private Context mContext;
    public ApplicationModule(Context context,String baseUrl){
        this.mContext=context;
        this.BASE_URL=baseUrl;
    }


    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    RxJava2CallAdapterFactory provideRxJava2CallAdapterFactory(){
        return RxJava2CallAdapterFactory.create();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory,RxJava2CallAdapterFactory adapterFactory){
        return new Retrofit.Builder()
                .client(client)
                .addConverterFactory(converterFactory)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(adapterFactory)
                .build();
    }

    @Singleton
    @Provides
    Context provideContext(){
        return mContext;
    }

}
