package com.spring.app.FinalCheck_Abstract;

public abstract class Order {

	protected ChannelType channel;
	protected ProductType productType;

	public Order(ChannelType channel, ProductType productType) {
		this.channel = channel;
		this.productType = productType;
	}

	public abstract void processOrder();
}
