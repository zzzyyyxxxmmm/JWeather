package com.wjk32.jweather.di.components;

import android.content.Context;

import com.wjk32.jweather.application.WeatherApplication;
import com.wjk32.jweather.di.module.ApplicationModule;
import com.wjk32.jweather.di.scope.PerActivity;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by wjk32 on 1/13/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    WeatherApplication getApplication();
    Context getContext();
}
