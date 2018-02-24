package com.forum.web.dao;

import java.util.List;

import com.forum.web.model.Users;

public interface UserDao {

	Users findById(int id);
	
	List<Users> findAllUsers();
	
	void save(Users user);
	
	void delete(Users user);	
	
	Users findByEmail(String email);
	
}
