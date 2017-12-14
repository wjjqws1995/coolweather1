package com.example.a680755.coolweather1.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 680755 on 2017/12/13.
 */

public class HttpUtil {
    public static void sendOkHttpResquest(String address ,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
