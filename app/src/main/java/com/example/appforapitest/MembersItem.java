package com.example.appforapitest;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MembersItem{

	@SerializedName("secretIdentity")
	private String secretIdentity;

	@SerializedName("name")
	private String name;

	@SerializedName("powers")
	private List<String> powers;

	@SerializedName("age")
	private int age;

	public void setSecretIdentity(String secretIdentity){
		this.secretIdentity = secretIdentity;
	}

	public String getSecretIdentity(){
		return secretIdentity;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPowers(List<String> powers){
		this.powers = powers;
	}

	public List<String> getPowers(){
		return powers;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"MembersItem{" + 
			"secretIdentity = '" + secretIdentity + '\'' + 
			",name = '" + name + '\'' + 
			",powers = '" + powers + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}