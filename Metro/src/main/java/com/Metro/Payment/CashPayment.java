package com.Metro.Payment;

import com.Metro.DTO.PaymentRequest;

public class CashPayment implements Makepayment {
	@Override
	public boolean doPayment(PaymentRequest request) {

		System.out.println("Processing Cash Payment...");
		System.out.println("TxnId: " + request.getTransactionId());

		// simulate success
		return true;
	}

}
