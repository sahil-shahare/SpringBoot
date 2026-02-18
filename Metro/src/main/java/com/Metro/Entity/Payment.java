package com.Metro.Entity;

import jakarta.persistence.*;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String upiId;
	private String transactionId;
	private Double amount;

	@Enumerated(EnumType.STRING)
	private PaymentType type;

	// One Payment -> One Ticket
	@OneToOne
	@JoinColumn(name = "ticket_id")
	private Ticket ticket;

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
