package com.example.appforapitest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDataShow
{
    @GET("/api/v3/exchangeInfo")
    Call<ExchangeInfo> getResponce();

    @GET("bins/g1k1g")
    Call<Response> getData();


}
