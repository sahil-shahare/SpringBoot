package com.Metro.DTO;

import com.Metro.Entity.PaymentType;

public class BookingRequestDTO {

	private String source;
	private String destination;
	private double amount;
	private PaymentType paymentType;
	private String customerUpi;
	private String transactionId;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public String getCustomerUpi() {
		return customerUpi;
	}

	public void setCustomerUpi(String customerUpi) {
		this.customerUpi = customerUpi;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
