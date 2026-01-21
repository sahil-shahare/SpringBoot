package com.Amazon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.Entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	User user;
	
	@GetMapping("/getuser")
	public int getUser() {
		return user.getId();
	}
	
}
