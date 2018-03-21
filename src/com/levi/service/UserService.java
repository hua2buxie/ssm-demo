package com.levi.service;

import org.springframework.stereotype.Service;

import com.levi.model.User;

public interface UserService {

	public boolean userLogin(User user);

	User registerUser(User user);
}
