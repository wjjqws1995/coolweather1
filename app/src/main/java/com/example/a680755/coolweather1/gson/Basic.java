package com.example.a680755.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 680755 on 2017/12/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
