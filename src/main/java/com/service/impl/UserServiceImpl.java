package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findUser(User user) {
		return userDao.findUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void addUser(User user) {
		if (null != userDao.findUser(user)) {
			userDao.updateUser(user);
		} else {
			synchronized (this) {
				if (null != userDao.findUser(user)) {
					userDao.updateUser(user);
				} else {
					userDao.addUser(user);
				}
			}
		}
	}

}
