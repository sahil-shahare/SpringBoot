package com.IT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IT.Entity.Employee;
import com.IT.Service.Employee_Service;

@RestController
public class Employee_Controller {
	@Autowired
	private Employee_Service eSevirce;
	
	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return eSevirce.saveEmployee(employee);
	}
	
	@GetMapping("/get-all-employee")
	public List<Employee> getEmployee(){
		return eSevirce.readEmloyee();
	}
	
}
