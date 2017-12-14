package com.example.a680755.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 680755 on 2017/12/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
