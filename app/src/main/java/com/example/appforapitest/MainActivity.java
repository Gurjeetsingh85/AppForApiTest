package com.example.appforapitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofit2.Call<ExchangeInfo> call= Retroclient.getInstance().getApi().getData();
        call.enqueue(new Callback<ExchangeInfo>() {
            @Override
            public void onResponse(Call<ExchangeInfo> call, Response<ExchangeInfo> response) {
                Log.e("tag","msg   "+new Gson().toJson(response));
            }

            @Override
            public void onFailure(Call<ExchangeInfo> call, Throwable t) {
                Log.e("tag","msg   "+t.fillInStackTrace());
            }
        });

//        Call<Response> call=Retroclient.getInstance().getApi().getData();
//        call.enqueue(new Callback<Response>() {
//            @Override
//            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//                Log.e("tag","msg   "+new Gson().toJson(response));
//            }
//
//            @Override
//            public void onFailure(Call<Response> call, Throwable t) {
//                Log.e("tag","msg   "+t.fillInStackTrace());
//            }
//        });

    }
}
