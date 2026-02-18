//package com.IT;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.IT.Entity.Company;
//import com.IT.Repository.Company_Repository;
//
//import jakarta.transaction.Transactional;
//
//@SpringBootTest
//@Transactional
//public class methodtest {
//	
//	@Autowired
//	private Company_Repository crepo;
//	
//	@Test
//	public void shouldStoreName() {
//		Company com = new Company();
//		com.setCname("IBM");
//		com.setCemail("IBM@gmail.com");
//		
//		Company com1 = crepo.save(com);
//		
//		assertEquals("IBM", com1.getCname());
//	}
//	
//
//}
