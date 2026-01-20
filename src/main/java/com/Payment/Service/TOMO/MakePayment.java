package com.Payment.Service.TOMO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MakePayment {
	
	private Payment_Interface payment;
	
	public MakePayment(@Qualifier("phonepe")Payment_Interface payment) {
		this.payment=payment;
	}
	
	public void makePayment() {
		payment.doTransaction();
		System.out.println("Payment done by "+payment.getClass().getSimpleName());
	}
}
