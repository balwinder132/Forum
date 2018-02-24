package com.forum.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.forum.web.model.Users;
import com.forum.web.service.LoginService;
import com.forum.web.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String login(ModelMap model){
		//Users user = new Users();
	//	model.addAttribute("users", user);
	//	model.addAttribute("edit", false);
		return "login";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap model){
		Users user = loginService.login(email, password);
		if(user!=null){
			model.addAttribute("users", user);
	//	model.addAttribute("edit", false);
		
		return "dashboard";
		}
		return "/";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registration(ModelMap model){
		Users user = new Users();
		model.addAttribute("users", user);
		model.addAttribute("edit", false);
		return "registration";
	}
	
	@RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
	public String saveUser(@Valid Users user, BindingResult result, ModelMap model){
		if(result.hasErrors()){
			return "registration";
		}
		userService.save(user);
		model.addAttribute("success", "Welcome, "+ user.toString() + ", Your registration is successful. ");
		return "success";
	}
}
