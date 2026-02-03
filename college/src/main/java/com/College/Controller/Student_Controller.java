package com.College.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.College.Entites.Student;
import com.College.Repository.Student_Repository;

@RestController
@RequestMapping("/student")
public class Student_Controller {

	@Autowired
	private Student_Repository repo;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		
		return student;
	}
	
	@GetMapping("/get-all-Student")
	public List<Student> getallStudent(){
		
		return repo.findAll();
	}
}
