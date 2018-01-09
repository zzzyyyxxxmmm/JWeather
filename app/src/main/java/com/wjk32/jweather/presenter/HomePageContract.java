package com.wjk32.jweather.presenter;

import com.wjk32.jweather.base.BasePresenter;
import com.wjk32.jweather.base.BaseView;
import com.wjk32.jweather.entities.Weather;

/**
 * Created by wjk32 on 1/8/2018.
 */

public interface HomePageContract {
    interface View extends BaseView<Presenter> {
        void displayWeatherInfo(Weather weather);
    }

    interface Presenter extends BasePresenter{
        void loadWeather(String cityname,boolean refreshornot);
    }
}
