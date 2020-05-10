package com.spring.app.FinalCheck_Observer;

public interface INotificationService {

	public void addObserver(INotificationObserver observer);
	public void removeObserver(INotificationObserver observer);
	public void notifyObserver();

}
