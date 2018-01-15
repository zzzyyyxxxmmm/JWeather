package com.wjk32.jweather.api;

import com.wjk32.jweather.entities.Weather;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wjk32 on 1/13/2018.
 */

public interface WeatherApiService {
    @GET("forecast")
    Flowable<Weather> getWeather(@Query("q") String city, @Query("mode") String mode, @Query("appid") String appid);

    @GET("forecast")
    Observable<Weather> getObWeather(@Query("q") String city, @Query("mode") String mode, @Query("appid") String appid);

    @GET("forecast")
    Call<Weather> getCallWeather(@Query("q") String city, @Query("mode") String mode, @Query("appid") String appid);

}