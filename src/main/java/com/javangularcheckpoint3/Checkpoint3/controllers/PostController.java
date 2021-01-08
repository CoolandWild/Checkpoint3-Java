package com.javangularcheckpoint3.Checkpoint3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.javangularcheckpoint3.Checkpoint3.entities.Posts;

import com.javangularcheckpoint3.Checkpoint3.repositorie.PostsRepository;
import com.javangularcheckpoint3.Checkpoint3.services.PostService;


@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
@RequestMapping("/posts")
public class PostController {
	

	@Autowired
	PostService  postService;

	@Autowired
	PostsRepository postRepository;
	
	@GetMapping
	public List<Posts> readAll() {
		return postService.getAllPosts();
	}
	
	@GetMapping("/{id}")
	public Posts read(@RequestParam(value="id") Long id) {
		return postService.getPostsById(id);
	}
}
