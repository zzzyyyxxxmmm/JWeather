package com.wjk32.jweather.base;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by wjk32 on 1/8/2018.
 */

public interface BasePresenter {


    void subscribe();

    void unsubscribe();
}