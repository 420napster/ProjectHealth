package com.docode.projecthealth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docode.projecthealth.model.User;
import com.docode.projecthealth.repository.UserRepository;
import com.docode.projecthealth.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
}
