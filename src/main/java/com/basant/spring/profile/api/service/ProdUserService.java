package com.basant.spring.profile.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.basant.spring.profile.api.model.User;
import com.basant.spring.profile.api.repository.UserRepository;

@Service
@Profile("prod")
public class ProdUserService implements UserProfilerService {
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}

}
