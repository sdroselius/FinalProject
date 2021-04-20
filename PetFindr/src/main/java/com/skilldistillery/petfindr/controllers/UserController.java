package com.skilldistillery.petfindr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.petfindr.services.UserService;

@RequestMapping("api")
@RestController
public class UserController {

	@Autowired
	private UserService userSvc;
	
	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
}
