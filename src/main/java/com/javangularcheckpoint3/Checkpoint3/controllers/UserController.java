package com.javangularcheckpoint3.Checkpoint3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javangularcheckpoint3.Checkpoint3.entities.User;
import com.javangularcheckpoint3.Checkpoint3.repositorie.UserRepository;
import com.javangularcheckpoint3.Checkpoint3.services.UserService;



@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	

	@Autowired
	UserService  userService;

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<User> readAll() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User read(@PathVariable Long id) {
		return userService.getUserById(id);
	}

}
