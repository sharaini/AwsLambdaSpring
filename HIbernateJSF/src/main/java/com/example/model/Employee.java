package com.example.model;

import java.io.Serializable;



public class Employee implements Serializable{
	private int id;
	private String name;
	private String address;
	private WalkingData walkingData;
	public WalkingData getWalkingData() {
		return walkingData;
	}
	public void setWalkingData(WalkingData walkingData) {
		this.walkingData = walkingData;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
