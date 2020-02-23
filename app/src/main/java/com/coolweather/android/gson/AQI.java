package com.coolweather.android.gson;

/**
 * Created by 45861 on 2020/2/20.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
