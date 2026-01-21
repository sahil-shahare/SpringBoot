package com.Payment.Service.TOMO;

import org.springframework.stereotype.Component;

@Component("phonepe")
public class PhonePe implements Payment_Interface {
	
	public PhonePe() {
		System.out.println("PhonePe Object Created...");
	}

	public void doTransaction() {
		System.out.println("PhonePe payment done...");
	}

}
