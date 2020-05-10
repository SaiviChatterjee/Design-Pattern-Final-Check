package com.spring.app.FinalCheck_Observer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	List<INotificationObserver> observers = null;

	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}

	public void addObserver(INotificationObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(INotificationObserver observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (INotificationObserver observer : observers) {
			if (observer.getTickets() > 100) {
				observer.nofication();
			}
		}
	}
}