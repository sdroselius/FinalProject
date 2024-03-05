package com.skilldistillery.onmycase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.onmycase.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
