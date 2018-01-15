package com.wjk32.jweather.mvp.presenter;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;
import retrofit2.Call;
import android.widget.Toast;

import com.wjk32.jweather.api.WeatherApiService;
import com.wjk32.jweather.application.WeatherApplication;
import com.wjk32.jweather.di.components.DaggerPresenterComponent;
import com.wjk32.jweather.di.module.ApplicationModule;
import com.wjk32.jweather.di.module.WeatherModule;
import com.wjk32.jweather.di.scope.PerActivity;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.mvp.model.WeatherContract;
import com.wjk32.jweather.util.schedulers.BaseSchedulerProvider;

import javax.inject.Inject;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by wjk32 on 1/8/2018.
 */

public class WeatherPresenter implements WeatherContract.Presenter{

    private static final String APIKEY="e638571500c460474a51e37671b49718";
    private static final String MODE="json";

    private  Context context;


    private CompositeDisposable mCompositeDisposable;

    private  WeatherContract.View mWeatherView;

    private  BaseSchedulerProvider mSchedulerProvider;

    @Inject WeatherApiService mApiService;



    @Inject
    WeatherPresenter(Context context,WeatherContract.View weatherView){
        this.context=context;
        mWeatherView=weatherView;

        mCompositeDisposable=new CompositeDisposable();
        mWeatherView.setPresenter(this);


        DaggerPresenterComponent.builder()
                .weatherModule(new WeatherModule(mWeatherView))
                .applicationComponent(WeatherApplication.getInstance().getApplicationComponent())
                .build().inject(this);

    }



    @Override
    public void subscribe() {
        String cityName="Bethlehem,us";
        loadWeather(cityName);
    }

    @Override
    public void unsubscribe() {
        mCompositeDisposable.clear();
    }

    public void loadWeather(String cityName) {
//
//        Observable<Weather> observable = mApiService.getObWeather(cityName,MODE,APIKEY);
//        observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new DisposableObserver<Weather>() {
//
//                    @Override
//                    public void onNext(Weather weather) {
//                        System.out.println(weather.toString());
//                    }
//
//                    @Override
//                    public void onComplete() {
//                    }
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//                });
        Flowable<Weather> weatherFlowable = mApiService.getWeather(cityName,MODE,APIKEY);

        Call<Weather> weatherCall=mApiService.getCallWeather(cityName,MODE,APIKEY);
        System.out.println(weatherCall.request().url().toString());

        Disposable disposable=weatherFlowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        //on Next
                        stats ->{
                            System.out.println(stats.toString());
                            mWeatherView.showWeather(stats);
                        },

                        //onError

                        throwable ->{
                            System.out.println(throwable.getMessage());
                        }
                        //onCompleted

                );

        mCompositeDisposable.add(disposable);
    }
}
