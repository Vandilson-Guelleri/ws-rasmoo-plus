package com.client.ws.ramossplus.service.impl;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.client.ws.ramossplus.dto.UserDto;
import com.client.ws.ramossplus.exception.BadRequestException;
import com.client.ws.ramossplus.exception.NotFoundException;
import com.client.ws.ramossplus.mapper.UserMapper;
import com.client.ws.ramossplus.model.User;
import com.client.ws.ramossplus.model.UserType;
import com.client.ws.ramossplus.repository.UserRepository;
import com.client.ws.ramossplus.repository.UserTypeRepository;
import com.client.ws.ramossplus.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	private final UserTypeRepository userTypeRepository;
	
	public UserServiceImpl(UserRepository userRepository, UserTypeRepository userTypeRepository) {
		this.userRepository = userRepository;
		this.userTypeRepository = userTypeRepository;
	}
	
	@Override
	public User create(UserDto dto) {
		if(Objects.nonNull(dto.getId())) {
			throw new BadRequestException("id deve ser nulo");
		}
		
		var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());
		
		if(userTypeOpt.isEmpty()) {
			throw new NotFoundException("userTypeId não encontrado");
		}
		
		UserType userType = userTypeOpt.get();
		
		User user = UserMapper.fromDtoToEntity(dto, userType, null);
		
		return userRepository.save(user);
	}

}
