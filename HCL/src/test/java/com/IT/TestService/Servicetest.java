package com.IT.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.IT.Entity.Company;
import com.IT.Exceptions.EmptyCompanyException;
import com.IT.Service.Company_Service;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class Servicetest {

	@Autowired
	Company_Service ser;

	@Test
	public void shouldAdd() {
//		Company com = new Company();
//		com.setCname("YXA");
//		com.setCemail("Y@gmail.com");
//
////		/Company com1 = cservice.saveCompany(com);
//
//		assertEquals("YXA", com1.getCname());

	}
	
	
	@Test
	public void ShouldThrowEmptyCompanyException()
	{
		Company comp=null;
	//	Executable
		
		EmptyCompanyException ex=assertThrows(EmptyCompanyException.class, ()->{
			ser.saveCompany(comp);
		});
		assertEquals("INVALID OPERATION!", ex.getMessage());
	}

}
