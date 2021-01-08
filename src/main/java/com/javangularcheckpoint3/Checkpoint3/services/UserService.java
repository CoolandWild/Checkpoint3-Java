package com.javangularcheckpoint3.Checkpoint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javangularcheckpoint3.Checkpoint3.entities.User;

import com.javangularcheckpoint3.Checkpoint3.repositorie.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository UserRepo;
	
	
	public List<User> getAllUsers() {
		return UserRepo.findAll();
	}
	
	public User getUserById(Long id) {
		return UserRepo.findById(id).get();
	}
	

}
