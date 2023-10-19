package com.client.ws.ramossplus.mapper;

import javax.swing.text.html.parser.DTD;

import com.client.ws.ramossplus.dto.SubscriptionTypeDto;
import com.client.ws.ramossplus.model.SubscriptionType;

public class SubscriptionTypeMapper {

	public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
		return SubscriptionType.builder()
				.id(dto.getId())
				.name(dto.getName())
				.accessMonths(dto.getAccessMonths())
				.price(dto.getPrice())
				.productKey(dto.getProductKey())
				.build();
	}
}
