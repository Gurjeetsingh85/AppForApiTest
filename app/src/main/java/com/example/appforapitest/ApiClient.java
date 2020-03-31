package com.example.appforapitest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient
{
    public static final String BURL="https://api.myjson.com/";
    public  static Retrofit retrofit;

    public static  Retrofit getApiClient()
    {
        retrofit = new Retrofit.Builder().baseUrl(BURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
