package com.spring.app.FinalCheck_Observer;

public abstract class INotificationObserver {

	protected INotificationService service;
	protected String name;
	protected int tickets;

	public INotificationObserver(INotificationService service, String name, int tickets) {
		this.service = service;
		this.name = name;
		this.tickets = tickets;
	}

	public int getTickets() {
		return tickets;
	}

	public abstract void nofication();

}