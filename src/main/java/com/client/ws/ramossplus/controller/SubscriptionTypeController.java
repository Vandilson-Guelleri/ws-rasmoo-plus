package com.client.ws.ramossplus.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.ramossplus.dto.SubscriptionTypeDto;
import com.client.ws.ramossplus.exception.NotFoundException;
import com.client.ws.ramossplus.model.SubscriptionType;
import com.client.ws.ramossplus.repository.SubscriptionTypeRepository;
import com.client.ws.ramossplus.service.SubscriptionTypeService;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {
	
	@Autowired
	private SubscriptionTypeService subscriptionTypeService;
	
	//busca toda a lista
	@GetMapping
	public ResponseEntity<List<SubscriptionType>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
	}

	//buscar por ID
	@GetMapping("/{id}")
	public ResponseEntity<SubscriptionType> findById(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<SubscriptionType> create(@RequestBody SubscriptionTypeDto dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeService.create(dto));
	}
}



















