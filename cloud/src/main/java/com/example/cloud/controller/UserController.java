package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.entity.UserEntity;
import com.example.cloud.service.UserService;

@RestController
@RequestMapping("/cont")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/save")
	public UserEntity saveUsers(@RequestBody UserEntity user){
		UserEntity response = userservice.saveUsers(user);
		return response;
	}

}
