package com.cab.model;

public class User {
	
	private String userName;
	private String userGender;
	private int userAge;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String userGender, int userAge) {
		super();
		this.userName = userName;
		this.userGender = userGender;
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userGender=" + userGender + ", userAge=" + userAge + "]";
	}	
	
}
