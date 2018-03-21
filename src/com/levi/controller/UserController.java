package com.levi.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.levi.model.User;
import com.levi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public Boolean userLogin(User user){
		Logger logger = LogManager.getLogger(UserController.class.getName());
		logger.debug("log4j  debug 进入了login controller");
		boolean userLogin = userService.userLogin(user);
		return userLogin;
	}
	@RequestMapping("/regieter")
	public User regieterUser(User user){
		Logger logger = LogManager.getLogger(UserController.class.getName());
		logger.debug("log4j  debug 进入了regieterUser controller");
		if(user==null){
			return null;
		}else{
			User registerUser = userService.registerUser(user);
			JSONObject jsonObject = new JSONObject();
			return registerUser;
		}
	}
}
