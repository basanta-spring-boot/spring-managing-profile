package com.basant.spring.profile.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.profile.api.model.User;
import com.basant.spring.profile.api.service.UserProfilerService;

@RestController
@RequestMapping("/profile-managing")
public class UserController {
	@Autowired
	@Qualifier("UserServiceImpl")
	private UserProfilerService service;

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return service.getUsers();
	}

}
