package com.levi.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.levi.dao.UserDao;
import com.levi.model.User;
import com.levi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public boolean userLogin(User user){
		User userLogin = userDao.userLogin(user);
		if(userLogin!=null){
			return true;
		}
		return false;
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public User registerUser(User user){
		userDao.registerUser(user);
		return  user;
	}
	public void insertUser(){
		
	}
}
