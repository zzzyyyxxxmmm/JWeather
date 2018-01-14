package com.wjk32.jweather.di.components;

import com.wjk32.jweather.di.module.WeatherModule;
import com.wjk32.jweather.di.scope.PerActivity;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.modules.home.MainActivity;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by wjk32 on 1/13/2018.
 */


@PerActivity
@Component(modules = WeatherModule.class,dependencies = ApplicationComponent.class)
public interface WeatherComponent {

    void inject(MainActivity activity);

}
