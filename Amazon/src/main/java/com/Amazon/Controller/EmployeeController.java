package com.Amazon.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.DTO.EmployeeDTO;
import com.Amazon.Entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	List<Employee> uss = new ArrayList<Employee>();

	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		if (employee != null) {
			uss.add(employee);
		}
		System.out.println(uss);
		return employee;
	}

	@GetMapping("get-dto-employee")
	public List<EmployeeDTO> getAll() {
		return uss.stream().map((i) -> {
			EmployeeDTO dto = new EmployeeDTO();
			dto.setCompany_name(i.getName());
			dto.setGst_number(i.getCompany().getGst_number());
			dto.setEid(i.getId());
			dto.setName(i.getName());
			return dto;
		}).collect(Collectors.toList());

	}

}
