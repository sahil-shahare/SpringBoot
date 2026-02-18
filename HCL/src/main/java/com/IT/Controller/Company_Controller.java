package com.IT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IT.Entity.Company;
import com.IT.Exceptions.EmptyCompanyException;
import com.IT.Service.Company_Service;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class Company_Controller {

	private Company company;
	@Autowired
	private Company_Service cService;

	@PostMapping("/add-company")
	public Company addCompany(@RequestBody Company company) throws Exception {
				return cService.saveCompany(company);
	}

	@GetMapping("/get-all-company")
	public List<Company> getCompany() {
		return cService.readCompany();
	}
}
 
