package com.Payment.Service.TOMO;

import org.springframework.stereotype.Component;

@Component
public class Gpay implements Payment_Interface {
	public Gpay() {
		System.out.println("Gpay Object created...");
	}

	public void doTransaction() {
		System.out.println("Gpay payment done...");
	}

}
