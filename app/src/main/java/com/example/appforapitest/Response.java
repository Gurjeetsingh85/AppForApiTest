package com.example.appforapitest;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("squadName")
	private String squadName;

	@SerializedName("secretBase")
	private String secretBase;

	@SerializedName("homeTown")
	private String homeTown;

	@SerializedName("members")
	private List<MembersItem> members;

	@SerializedName("active")
	private boolean active;

	@SerializedName("formed")
	private int formed;

	public void setSquadName(String squadName){
		this.squadName = squadName;
	}

	public String getSquadName(){
		return squadName;
	}

	public void setSecretBase(String secretBase){
		this.secretBase = secretBase;
	}

	public String getSecretBase(){
		return secretBase;
	}

	public void setHomeTown(String homeTown){
		this.homeTown = homeTown;
	}

	public String getHomeTown(){
		return homeTown;
	}

	public void setMembers(List<MembersItem> members){
		this.members = members;
	}

	public List<MembersItem> getMembers(){
		return members;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setFormed(int formed){
		this.formed = formed;
	}

	public int getFormed(){
		return formed;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"squadName = '" + squadName + '\'' + 
			",secretBase = '" + secretBase + '\'' + 
			",homeTown = '" + homeTown + '\'' + 
			",members = '" + members + '\'' + 
			",active = '" + active + '\'' + 
			",formed = '" + formed + '\'' + 
			"}";
		}
}