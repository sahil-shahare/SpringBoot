package com.Amazon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.Entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

	User user;

	@PostMapping("/addname")
	public String addName(@RequestParam String name) {
		return name + " Added";
	}

	@PostMapping("/addid")
	public String addId(@RequestParam int id) {
		return id + "ID Added";
	}

	@GetMapping("/getname")
	public String getName(@RequestParam(required = false, defaultValue = "Guest") String name) {
		return "Hello" + name;
	}

	@GetMapping("/getid")
	public String getId(@RequestParam(required = false, defaultValue = "0") int id) {
		return "User ID : " + id;
	}

}
