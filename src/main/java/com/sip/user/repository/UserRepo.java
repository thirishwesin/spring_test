package com.sip.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sip.user.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
}
