package com.example.a680755.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 680755 on 2017/12/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More morel;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
