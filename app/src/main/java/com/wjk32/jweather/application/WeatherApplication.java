package com.wjk32.jweather.application;

import android.app.Application;

import com.wjk32.jweather.di.components.ApplicationComponent;
import com.wjk32.jweather.di.components.DaggerApplicationComponent;
import com.wjk32.jweather.di.module.ApplicationModule;

import io.reactivex.annotations.Nullable;

/**
 * Created by wjk32 on 1/13/2018.
 */

public class WeatherApplication extends Application {


    private ApplicationComponent mApplicationComponent;

    private static WeatherApplication weatherApplicationInstance;

    public static WeatherApplication getInstance() {

        return weatherApplicationInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
        mApplicationComponent=DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        weatherApplicationInstance = this;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}