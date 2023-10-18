package com.client.ws.ramossplus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.ramossplus.dto.SubscriptionTypeDto;
import com.client.ws.ramossplus.exception.NotFoundException;
import com.client.ws.ramossplus.model.SubscriptionType;
import com.client.ws.ramossplus.repository.SubscriptionTypeRepository;
import com.client.ws.ramossplus.service.SubscriptionTypeService;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService{

	private SubscriptionTypeRepository subscriptionTypeRepository;
	
	SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository) {
		this.subscriptionTypeRepository = subscriptionTypeRepository;
	}
	
	@Override
	public List<SubscriptionType> findAll() {
		return subscriptionTypeRepository.findAll();
	}

	@Override
	public SubscriptionType findById(Long id) {
		Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
		if (optionalSubscriptionType.isEmpty()) {
			throw new NotFoundException("SubscriptionType não encontrado");
		}
		return optionalSubscriptionType.get();
	}

	@Override
	public SubscriptionType create(SubscriptionTypeDto dto) {
		return subscriptionTypeRepository.save(SubscriptionType.builder()
					.id(dto.getId())
					.name(dto.getName())
					.accessMonth(dto.getAccessMonth())
					.price(dto.getPrice())
					.productKey(dto.getProductKey())
				.build());
	}

	@Override
	public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
