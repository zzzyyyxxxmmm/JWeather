package com.wjk32.jweather.mvp.model;

import com.wjk32.jweather.base.BasePresenter;
import com.wjk32.jweather.base.BaseView;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.entities.WeatherFilterType;

/**
 * Created by wjk32 on 1/14/2018.
 */

public interface WeatherContract {
    interface View extends BaseView<Presenter> {


        void showWeather(Weather weather);

        boolean isActive();
    }

    interface Presenter extends BasePresenter {

        void setFiltering(WeatherFilterType requestType);

        WeatherFilterType getFiltering();
    }
}
