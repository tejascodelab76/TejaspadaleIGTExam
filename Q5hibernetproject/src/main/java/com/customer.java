package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {
	
	@Id    
	private int cid;
	private String name;
	private String place;
	private int pan;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	
	
	

}
