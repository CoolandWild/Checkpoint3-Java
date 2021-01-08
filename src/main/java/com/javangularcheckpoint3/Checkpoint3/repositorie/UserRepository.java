package com.javangularcheckpoint3.Checkpoint3.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;


import com.javangularcheckpoint3.Checkpoint3.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}