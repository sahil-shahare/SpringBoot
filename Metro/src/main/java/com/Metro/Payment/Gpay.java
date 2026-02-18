package com.Metro.Payment;

import org.springframework.stereotype.Component;

import com.Metro.DTO.PaymentRequest;

@Component("GPAY")
public class Gpay implements Makepayment {

	@Override
    public boolean doPayment(PaymentRequest request) {

        if (request.getAmount() <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }

        if (request.getCustomerUpi() == null) {
            throw new IllegalArgumentException("Customer UPI required");
        }

        System.out.println("Processing GPAY Payment...");
        System.out.println("TxnId: " + request.getTransactionId());

        // simulate success
        return true;
    }
}
