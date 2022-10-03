package com.cab.repository;

import java.util.ArrayList;
import java.util.List;

import com.cab.model.User;



public class UserRepository {

	List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	public void addUserInList(User user)
	{
		this.userList.add(user);
	}
	
	public List<User> displayList()
	{
		return userList;
	}
}
