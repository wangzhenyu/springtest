package com.wang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wang.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
