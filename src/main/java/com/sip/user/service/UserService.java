package com.sip.user.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sip.user.model.User;
import com.sip.user.repository.UserRepo;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo repo;

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	
}
