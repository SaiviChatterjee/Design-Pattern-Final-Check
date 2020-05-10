package com.spring.app.FinalCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}

	static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {

		// Orders from E-Commerce Website
		Order order1 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		Order order2 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.FURNITURE);
		Order order3 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.TOYS);

		// Orders from Tele Caller Agents Application
		Order order4 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		Order order5 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.FURNITURE);
		Order order6 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.TOYS);

		// Processing Orders
		order1.processOrder();
		order2.processOrder();
		order3.processOrder();

		order4.processOrder();
		order5.processOrder();
		order6.processOrder();

	}
}