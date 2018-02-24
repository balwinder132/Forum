package com.forum.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.forum.web.model.Users;

public interface UserService {


	Users findById(int id);
	
	List<Users> findAllUsers();
	
	void save(Users user);
	
	void delete(Users user);	
		
	Users findByEmail(String email);
	
}
