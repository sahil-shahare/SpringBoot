package com.Metro.DTO;

public class PaymentRequest {

	private double amount;
	private String customerUpi;
	private String merchantUpi;
	private String transactionId;

	// getters & setters
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerUpi() {
		return customerUpi;
	}

	public void setCustomerUpi(String customerUpi) {
		this.customerUpi = customerUpi;
	}

	public String getMerchantUpi() {
		return merchantUpi;
	}

	public void setMerchantUpi(String merchantUpi) {
		this.merchantUpi = merchantUpi;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
