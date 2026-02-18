package com.IT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT.Entity.Company;
import com.IT.Exceptions.EmptyCompanyException;
import com.IT.Repository.Company_Repository;

@Service
public class Company_Service {

	@Autowired
	private Company_Repository cRepo;

	public Company saveCompany(Company company) throws EmptyCompanyException{
		
		if (company == null) {

			throw new EmptyCompanyException("INVALID OPERATION!");

		}

		return cRepo.save(company);

	}
	
	public List<Company> readCompany(){
		return cRepo.findAll();
	}
}