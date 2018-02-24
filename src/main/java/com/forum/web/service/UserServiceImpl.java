package com.forum.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forum.web.dao.UserDao;
import com.forum.web.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public Users findById(int id) {
		return userDao.findById(id);
	}

	public List<Users> findAllUsers() {
		return userDao.findAllUsers();
	}

	public void save(Users user) {
		user.setActive(true);
		userDao.save(user);
	}

	public void delete(Users user) {
		userDao.delete(user);
	}

	public Users findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	
}
