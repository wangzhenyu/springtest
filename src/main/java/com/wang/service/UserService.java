package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.entity.User;
import com.wang.repositories.UserRepository;
@Service
public class UserService implements IUserService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

}
