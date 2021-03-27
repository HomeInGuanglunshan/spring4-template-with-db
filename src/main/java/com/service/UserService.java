package com.service;

import com.entity.User;

public interface UserService {

	User findUser(User user);
	
	void updateUser(User user);
	
	void addUser(User user);
}
