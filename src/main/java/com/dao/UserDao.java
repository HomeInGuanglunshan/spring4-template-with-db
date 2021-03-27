package com.dao;

import com.entity.User;

public interface UserDao {
	
	User findUser(User user);
	
	void updateUser(User user);
	
	void addUser(User user);
}
