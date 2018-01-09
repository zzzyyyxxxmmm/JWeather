package com.wjk32.jweather.data;

import android.content.Context;

import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.entities.WeatherInterface;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wjk32 on 1/8/2018.
 */

public class ObWeatherData {
    private static final String APIKEY="";
    private static final String BASE_URL="http://api.openweathermap.org/data/2.5/";
    private static final String MODE="json";

    public static Observable<Weather> getWeather(Context context, String cityName, boolean refreshornot) {

        cityName="Bethlehem,us";
        okhttp3.OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(5, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        WeatherInterface apiService = retrofit.create(WeatherInterface.class);
        Observable<Weather> observable = apiService.getWeather(cityName,MODE,APIKEY);

        return observable;
    }
}
