package com.wjk32.jweather.entities;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wjk32 on 1/7/2018.
 */

public interface WeatherInterface {
    @GET("forecast")
    Observable<Weather> getWeather(@Query("q") String city, @Query("mode") String mode, @Query("appid") String appid);
}
