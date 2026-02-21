package com.Spring.Cashing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Cashing.Entity.Student;
import com.Spring.Cashing.Repository.StudentRepo;
import com.Spring.Cashing.Service.MailSenderService;

@RestController

public class StudentController {

	@Autowired
	private StudentRepo srepo;
	
	@Autowired
	private MailSenderService mailservice;

	@PostMapping("/add")
	@CacheEvict(value = "students", allEntries = true)
	public Student addStudent(@RequestBody Student student) {
		mailservice.sendMail(student.getSemail());
		return srepo.save(student);
	}

	@GetMapping("/get")
	@Cacheable(value = "students", key = "'all'")
	public List<Student> getStudent() throws InterruptedException {
		Thread.sleep(5000);
		return srepo.findAll();
	}

	@GetMapping("/get-by-id/{id}")
	@Cacheable(value = "students", key = "#id")
	public Student getStudent(
			@PathVariable("id") int id) throws InterruptedException {
		Thread.sleep(5000);
		return srepo.findById(id).get();
	}

	@DeleteMapping("/del-by-id/{id}")
	@CacheEvict(value = "students", key = "#id")
	public String delStudent(@PathVariable("id") int id) {
		srepo.deleteById(id);
		return "deleted";
	}

	@PutMapping("/put-by-id")
	@CachePut(value = "getIdstudents", key = "#student.id")
	@CacheEvict(value = "putstudents", allEntries = true)
	public Student putStudent(@RequestBody Student student) {
		return srepo.save(student);
	}

}
