package com.wjk32.jweather.helper;

import android.graphics.ColorSpace;

import com.wjk32.jweather.R;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.entities.WeatherDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjk32 on 1/14/2018.
 */

public class WeatherHelper {
    public static final double TRANS=273.15;
    public static List<WeatherDetail> createDetails(Weather weather){
        List<WeatherDetail> details = new ArrayList<>();
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Temp", String.valueOf(weather.getList().get(0).getMain().getTemp()-TRANS)+ "°C"));
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Humidity", String.valueOf(weather.getList().get(0).getMain().getHumidity()) + "%"));
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Pressure", String.valueOf(weather.getList().get(0).getMain().getPressure())  + "hPa"));
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Sea Level", String.valueOf(weather.getList().get(0).getMain().getPressure())+ "hPa"));
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Grnd Level", String.valueOf(weather.getList().get(0).getMain().getGrnd_level())+ "hPa"));
        details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Cloud", String.valueOf(weather.getList().get(0).getClouds().getAll()) + "%"));
        //details.add(new WeatherDetail(R.drawable.ic_index_sunscreen, "Wind Speed", String.valueOf(weather.getList().get(0).getWind().getSpeed()) + "m"));
        return details;
    }
}
