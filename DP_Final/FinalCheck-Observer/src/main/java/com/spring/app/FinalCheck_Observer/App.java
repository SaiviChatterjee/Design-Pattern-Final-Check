package com.spring.app.FinalCheck_Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}

	static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		// Instantiating Notification Service
		INotificationService service = new NotificationService();

		// Instantiating Admins
		INotificationObserver admin1 = new Admin(service, "Saivi", 120);
		INotificationObserver admin2 = new Admin(service, "Swaralipi", 11);

		// Admin Subscribing Service
		service.addObserver(admin1);
		service.addObserver(admin2);

		// Sending Notification to Admin of Events with more than 100 Sold Ticket
		service.notifyObserver();
	}
}
