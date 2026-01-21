package com.Payment.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Payment.Service.TOMO.MakePayment;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
		
		
		MakePayment mp = context.getBean(MakePayment.class);
        mp.makePayment();
	}

}
