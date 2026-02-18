package com.Metro.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double ticketPrice;
	private String source;
	private String destination;

	@JoinColumn(name = "commutor_id")
	private Commutor commutor;

	@OneToOne(mappedBy = "ticket", cascade = CascadeType.PERSIST)
	private Payment payment;

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

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

	public Commutor getCommutor() {
		return commutor;
	}

	public void setCommutor(Commutor commutor) {
		this.commutor = commutor;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	final List<String> mupi = List.of("MahaMetro@sbi","MahaMetro@ybl","MahaMetro@axl");
}
