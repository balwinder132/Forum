package com.forum.web.service;

import com.forum.web.model.Users;

public interface LoginService {

	Users login(String email, String password);
}
