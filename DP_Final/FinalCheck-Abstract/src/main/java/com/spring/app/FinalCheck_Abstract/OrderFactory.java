package com.spring.app.FinalCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderFactory {

	static final Logger LOGGER = LoggerFactory.getLogger(OrderFactory.class);

	public static Order getOrder(ChannelType channel, ProductType productType) {
		if (channel == ChannelType.ECOMMERCE) {
			return new ECommerceChannel().getOrder(productType);
		}
		return new TeleCommunicationChannel().getOrder(productType);
	}
}