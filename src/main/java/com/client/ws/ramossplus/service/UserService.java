package com.client.ws.ramossplus.service;

import com.client.ws.ramossplus.dto.UserDto;
import com.client.ws.ramossplus.model.User;

public interface UserService {

	User create(UserDto dto);
}
