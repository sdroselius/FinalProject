package com.skilldistillery.petfindr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.petfindr.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
