package com.wjk32.jweather.mvp.presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Created by wjk32 on 1/13/2018.
 */
public class WeatherPresenterTest {

    @Inject
    WeatherPresenter weatherPresenter;

    @Before
    public void setupStatisticsPresenter() {
        // Mockito has a very convenient way to inject mocks by using the @Mock annotation. To
        // inject the mocks in the test the initMocks method needs to be called.
        MockitoAnnotations.initMocks(this);

    }



    @Test
    public void getWeather() throws Exception {
        weatherPresenter.loadWeather("Bethlehem,us");
    }

}