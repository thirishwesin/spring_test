package com.sip.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.sip.user.model.User;
import com.sip.user.service.UserService;


public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> allUsers() {
		return service.findAll();
	}
}
