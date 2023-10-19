package com.client.ws.ramossplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.ramossplus.model.User;
import com.client.ws.ramossplus.model.UserPaymentInfo;
import com.client.ws.ramossplus.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{

}
