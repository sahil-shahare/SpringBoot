package com.Metro.Payment;


import org.springframework.stereotype.Component;

import com.Metro.DTO.PaymentRequest;	

@Component("PHONEPE")
public class Phonepe implements Makepayment {

    @Override
    public boolean doPayment(PaymentRequest request) {

        if (request.getAmount() <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }

        if (request.getCustomerUpi() == null) {
            throw new IllegalArgumentException("Customer UPI required");
        }

        System.out.println("Processing PhonePe Payment...");
        System.out.println("TxnId: " + request.getTransactionId());

        // simulate success
        return true;
    }
}
