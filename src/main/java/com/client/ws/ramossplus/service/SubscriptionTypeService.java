package com.client.ws.ramossplus.service;

import java.util.List;

import com.client.ws.ramossplus.dto.SubscriptionTypeDto;
import com.client.ws.ramossplus.model.SubscriptionType;

public interface SubscriptionTypeService {
	
	List<SubscriptionType> findAll();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionTypeDto dto);
	
	SubscriptionType update(Long id, SubscriptionTypeDto dto);
	
	void delete(Long id);
}
