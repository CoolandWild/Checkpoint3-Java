package com.javangularcheckpoint3.Checkpoint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javangularcheckpoint3.Checkpoint3.entities.Posts;

import com.javangularcheckpoint3.Checkpoint3.repositorie.PostsRepository;
import com.javangularcheckpoint3.Checkpoint3.repositorie.UserRepository;

@Service
public class PostService {
	
	@Autowired
	UserRepository UserRepo;
	
	@Autowired
	PostsRepository PostsRepo;
	
	public List<Posts> getAllPosts() {
		return PostsRepo.findAll();
	}
	
	public Posts getPostsById(Long id) {
		return PostsRepo.findById(id).get();
	}
	

}
