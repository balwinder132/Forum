package com.forum.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forum.web.model.Users;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserService userService;
	
	public Users login(String email, String password) {
				
		Users user = userService.findByEmail(email);
		if(user.getActive() && user.getPassword().equals(password))
		{
			return user;
		}
		return null;
	}

}
