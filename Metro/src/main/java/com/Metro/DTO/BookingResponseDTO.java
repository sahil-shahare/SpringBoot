package com.Metro.DTO;


public class BookingResponseDTO {

    private Long ticketId;
    private String route;
    private double amount;
    private String status;

    public BookingResponseDTO(Long ticketId, String route, double amount, String status) {
        this.ticketId = ticketId;
        this.route = route;
        this.amount = amount;
        this.status = status;
    }

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
}

