package com.example.appforapitest;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("serverTime")
	private long serverTime;

	public void setServerTime(long serverTime){
		this.serverTime = serverTime;
	}

	public long getServerTime(){
		return serverTime;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"serverTime = '" + serverTime + '\'' + 
			"}";
		}
}