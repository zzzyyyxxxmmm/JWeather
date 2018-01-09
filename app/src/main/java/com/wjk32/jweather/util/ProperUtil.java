package com.wjk32.jweather.util;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wjk32 on 1/8/2018.
 */

public class ProperUtil {
    private static Properties weatherappid;
    public static Properties getProperties(Context c){
        Properties props = new Properties();
        try {
            //方法一：通过activity中的context攻取setting.properties的FileInputStream
            InputStream in = c.getAssets().open("config.properties");
            //方法二：通过class获取setting.properties的FileInputStream
            //InputStream in = PropertiesUtill.class.getResourceAsStream("/assets/  setting.properties "));
            props.load(in);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        weatherappid = props;
        System.out.println(weatherappid.getProperty("serverUrl"));
        return weatherappid;
    }

}