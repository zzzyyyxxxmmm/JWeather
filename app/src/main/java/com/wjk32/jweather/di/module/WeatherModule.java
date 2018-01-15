package com.wjk32.jweather.di.module;

import com.wjk32.jweather.api.WeatherApiService;
import com.wjk32.jweather.di.scope.PerActivity;
import com.wjk32.jweather.mvp.model.WeatherContract;
import com.wjk32.jweather.mvp.presenter.WeatherPresenter;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Component;
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
public class WeatherModule {

    private WeatherContract.View view;

    public WeatherModule(WeatherContract.View view) {

        this.view = view;
    }




    @PerActivity
    @Provides
    GsonConverterFactory provideGsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    @PerActivity
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
    }

    @PerActivity
    @Provides
    RxJava2CallAdapterFactory provideRxJava2CallAdapterFactory(){
        return RxJava2CallAdapterFactory.create();
    }

    @PerActivity
    @Provides
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory,RxJava2CallAdapterFactory adapterFactory){
        return new Retrofit.Builder()
                .client(client)
                .addConverterFactory(converterFactory)
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .addCallAdapterFactory(adapterFactory)
                .build();
    }
    @PerActivity
    @Provides
    WeatherApiService provideWeatherApiService(Retrofit retrofit){
        return retrofit.create(WeatherApiService.class);
    }


    @Provides
    @PerActivity
    WeatherContract.View provideWeatherContractView() {
        return view;
    }
}
