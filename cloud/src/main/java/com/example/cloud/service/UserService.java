package com.example.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloud.entity.UserEntity;
import com.example.cloud.repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserEntity saveUsers(UserEntity user) { 
		return userRepo.save(user);	
		
	}

}
