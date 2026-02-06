package com.IT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT.Entity.Employee;
import com.IT.Repository.Employee_Repository;

@Service
public class Employee_Service {

	@Autowired
	private Employee_Repository eRepo;
	
	public Employee saveEmployee(Employee employee) {
		return eRepo.save(employee);
	}
	
	public List<Employee> readEmloyee(){
		return eRepo.findAll();
	}
}
