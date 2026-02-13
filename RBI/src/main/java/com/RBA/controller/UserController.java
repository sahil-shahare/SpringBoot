package com.RBA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RBA.Entity.UserEntity;
import com.RBA.Repository.UserRepository;

@RestController
public class UserController {
	
	 @Autowired
	 private UserRepository repo;


	@PostMapping("/add-user")
	 public UserEntity addUser(@RequestBody UserEntity user)
	 {
		 
		 BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(5);
		 
		 UserEntity us=new UserEntity();
		 us.setUsername(user.getUsername());
		 us.setRoles(user.getRoles());
		 us.setPassword(bcrypt.encode(user.getPassword()));
		
		 return repo.save(us);
	 }
	 
	@GetMapping("/get-user")
	 public List<UserEntity>getUser()
	 {
		
		 return repo.findAll();
	 }
}
