package com.example.coolweather.gson;

/**
 * Created by zyx on 2018/2/20.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
