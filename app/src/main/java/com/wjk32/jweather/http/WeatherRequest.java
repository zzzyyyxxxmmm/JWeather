package com.wjk32.jweather.http;

import com.wjk32.jweather.entities.WeatherInterface;
import com.wjk32.jweather.entities.Weather;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wjk32 on 1/7/2018.
 */

public class WeatherRequest {

    private static WeatherRequest instance = new WeatherRequest();

    private static final String CITY="Bethlehem,us";
    private static final String APIKEY="";
    private static final String BASE_URL="http://api.openweathermap.org/data/2.5/";
    private static final String MODE="json";



    private Weather weatherlist;
    public WeatherRequest() {
    }
    public static WeatherRequest getInstance() {
        return instance;
    }
    public Weather getWeatherlist() {
        return weatherlist;
    }
    public void getnews(){
        okhttp3.OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(5, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        WeatherInterface apiService = retrofit.create(WeatherInterface.class);
        Observable<Weather> observable = apiService.getWeather(CITY,MODE,APIKEY);


        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<Weather>() {
                    @Override
                    public void onComplete() {
                        //System.out.println(weatherlist.toString());
                    }
                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(Weather weatherElist) {

                        if(weatherlist==null){
                            weatherlist=weatherElist;
                        }

                    }
                });

    }
}
