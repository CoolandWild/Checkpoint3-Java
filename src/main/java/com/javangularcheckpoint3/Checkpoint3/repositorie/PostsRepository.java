package com.javangularcheckpoint3.Checkpoint3.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;


import com.javangularcheckpoint3.Checkpoint3.entities.Posts;



public interface PostsRepository extends JpaRepository<Posts, Long> {
	
}
