package com.wjk32.jweather.presenter;

import android.content.Context;
import android.widget.Toast;

import com.wjk32.jweather.data.ObWeatherData;
import com.wjk32.jweather.entities.Weather;

import org.reactivestreams.Subscription;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by wjk32 on 1/8/2018.
 */

public class HomePagePresenter implements HomePageContract.Presenter{










    private final Context context;
    private final HomePageContract.View weatherView;

    private CompositeDisposable subscriptions;

    @Inject
    public HomePagePresenter(Context context, HomePageContract.View weatherView) {
        System.out.println("调用presenter构造方法");

        this.context = context;
        this.weatherView = weatherView;
        this.subscriptions=new CompositeDisposable();
        weatherView.setPresenter(this);
    }

    @Override
    public void subscribe() {
        String cityName="Bethlehem,us";
        loadWeather(cityName,false);
    }

    @Override
    public void unSubscribe() {
        subscriptions.clear();
    }

    @Override
    public void loadWeather(String cityname, boolean refreshornot) {
        Disposable subscription= ObWeatherData.getWeather(context,"",false)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(weatherView::displayWeatherInfo,throwable -> {
                    Toast.makeText(context, throwable.getMessage(), Toast.LENGTH_LONG).show();
                });
        subscriptions.add(subscription);
    }
}
