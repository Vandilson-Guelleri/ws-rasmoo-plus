package com.client.ws.ramossplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.ramossplus.model.SubscriptionType;
import com.client.ws.ramossplus.model.User;

@Repository
public interface UserRepository extends JpaRepository<SubscriptionType, Long>{

}
