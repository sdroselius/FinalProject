package com.skilldistillery.onmycase.services;

import com.skilldistillery.onmycase.entities.User;

public interface AuthService {

	public User register(User user);
	public User getUserByUsername(String username);
	
}
