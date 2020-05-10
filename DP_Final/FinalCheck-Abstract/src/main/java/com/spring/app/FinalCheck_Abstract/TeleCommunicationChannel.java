package com.spring.app.FinalCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeleCommunicationChannel {

	static final Logger LOGGER = LoggerFactory.getLogger(TeleCommunicationChannel.class);
	
	
	public Order getOrder(ProductType productType) {
		if (productType == ProductType.ELECTRONIC) {
			return new ElectronicOrder(ChannelType.TELECOMM, productType);
		} else if (productType == ProductType.FURNITURE) {
			return new FurnitureOrder(ChannelType.TELECOMM, productType);
		}
		return new ToysOrder(ChannelType.TELECOMM, productType);
	}
}
