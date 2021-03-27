package com.entity;

import java.util.Date;

public class User {

	String username;
	
	String password;
	
	Date lastLoginTime;

	public User() {
		super();
	}

	public User(String username, String password, Date lastLoginTime) {
		super();
		this.username = username;
		this.password = password;
		this.lastLoginTime = lastLoginTime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}
