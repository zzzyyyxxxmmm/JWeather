package com.wjk32.jweather.mvp.view;

import com.wjk32.jweather.base.BaseView;
import com.wjk32.jweather.entities.Weather;

/**
 * Created by wjk32 on 1/8/2018.
 */

public interface MainView extends BaseView {
    void onShowString(Weather weather);
}
