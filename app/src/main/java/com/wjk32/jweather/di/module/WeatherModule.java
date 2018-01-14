package com.wjk32.jweather.di.module;

import com.wjk32.jweather.api.WeatherApiService;
import com.wjk32.jweather.di.scope.PerActivity;
import com.wjk32.jweather.mvp.view.MainView;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by wjk32 on 1/13/2018.
 */
@Module
public class WeatherModule {

    private MainView mainView;

    public WeatherModule(MainView view){
        mainView=view;
    }


    @PerActivity
    @Provides
    WeatherApiService provideWeatherApiService(Retrofit retrofit){
        return retrofit.create(WeatherApiService.class);
    }

    @PerActivity
    @Provides
    MainView provideMainView(){
        return mainView;
    }
}
