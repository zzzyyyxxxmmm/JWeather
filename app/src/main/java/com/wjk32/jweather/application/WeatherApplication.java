package com.wjk32.jweather.application;

import android.app.Application;

import com.wjk32.jweather.di.components.ApplicationComponent;
import com.wjk32.jweather.di.components.DaggerApplicationComponent;
import com.wjk32.jweather.di.module.ApplicationModule;

/**
 * Created by wjk32 on 1/13/2018.
 */

public class WeatherApplication extends Application {

    private ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
        mApplicationComponent=DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this,"http://api.openweathermap.org/data/2.5/"))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
