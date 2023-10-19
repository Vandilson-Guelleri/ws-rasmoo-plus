package com.client.ws.ramossplus.mapper;

import org.springframework.data.convert.DtoInstantiatingConverter;

import com.client.ws.ramossplus.dto.UserDto;
import com.client.ws.ramossplus.model.SubscriptionType;
import com.client.ws.ramossplus.model.User;
import com.client.ws.ramossplus.model.UserType;

public class UserMapper {

	public static User fromDtoToEntity(UserDto dto, UserType userType, SubscriptionType subscriptionType) {
		
		return User.builder()
					.id(dto.getId())
					.name(dto.getName())
					.cpf(dto.getCpf())
					.email(dto.getEmail())
					.phone(dto.getPhone())
					.dtSubscription(dto.getDtSubscription())
					.dtExpiration(dto.getDtExpiration())
					.userType(userType)
					.subscriptionType(subscriptionType)
				.build();
	}
}
