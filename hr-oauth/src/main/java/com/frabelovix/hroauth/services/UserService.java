package com.frabelovix.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frabelovix.hroauth.entities.User;
import com.frabelovix.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class); 
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			logger.error("Email não encontrado " + email);
			throw new IllegalArgumentException("Email não encontrado!");
		}	
		logger.info("Email encontrado " + email);
		
		return user;
		
	}
}
