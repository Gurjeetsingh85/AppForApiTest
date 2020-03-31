package com.example.appforapitest;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity {
    private ApiDataShow apiDataShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiDataShow = ApiClient.getApiClient().create(ApiDataShow.class);
//        Call<ExchangeInfo> call=apiDataShow.getResponce();
//        call.enqueue(new Callback<ExchangeInfo>() {
//            @Override
//            public void onResponse(Call<ExchangeInfo> call, Response<ExchangeInfo> response) {
//                Log.e("tag","msg  "+new Gson().toJson(response.body()));
//            }
//
//            @Override
//            public void onFailure(Call<ExchangeInfo> call, Throwable t) {
//                Log.e("tag","msgs  "+t.fillInStackTrace());
//            }
//        });
        Call<Response> call=apiDataShow.getData();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Log.e("tag","msg  "+new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.e("tag","msgs  "+t.fillInStackTrace());
            }
        });


    }
}
