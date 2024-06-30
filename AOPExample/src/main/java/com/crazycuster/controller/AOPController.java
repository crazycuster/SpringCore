package com.crazycuster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPController {
	
	@GetMapping("/hello")
	public String getAllUsers()
	{
		System.out.println("Get all users from usercontroller class");
		return "success";
		
	}

}
