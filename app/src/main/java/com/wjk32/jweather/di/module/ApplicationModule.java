package com.wjk32.jweather.di.module;

import android.content.Context;

import com.google.gson.Gson;
import com.wjk32.jweather.api.WeatherApiService;
import com.wjk32.jweather.application.WeatherApplication;
import com.wjk32.jweather.di.scope.PerActivity;

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

    private Context mContext;
    public ApplicationModule(Context context){
        this.mContext=context;
    }


    @Provides
    @Singleton
    WeatherApplication provideApplication() {

        return (WeatherApplication) mContext.getApplicationContext();
    }





    @Singleton
    @Provides
    Context provideContext(){
        return mContext;
    }

}
