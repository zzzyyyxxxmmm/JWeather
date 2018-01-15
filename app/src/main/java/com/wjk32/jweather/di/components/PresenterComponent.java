package com.wjk32.jweather.di.components;


import com.wjk32.jweather.di.module.ApplicationModule;
import com.wjk32.jweather.di.module.WeatherModule;
import com.wjk32.jweather.di.scope.PerActivity;
import com.wjk32.jweather.mvp.presenter.WeatherPresenter;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Component(modules = WeatherModule.class,dependencies = ApplicationComponent.class)
public interface PresenterComponent {

    void inject(WeatherPresenter presenter);

}
 