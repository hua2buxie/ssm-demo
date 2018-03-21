package com.levi.dao;

import com.levi.model.User;

public interface UserDao {
	User userLogin(User user);
	int registerUser(User user);
}
