package com.jlu.dao;

import com.jlu.model.User;

public interface UserDao {

	public void insertOneRow();

	public void insertAnotherOneRow();
	
	//public String findNameById(String id);
	
	public void deleteUserTb();
	
	public User findUserById(String id);
}
