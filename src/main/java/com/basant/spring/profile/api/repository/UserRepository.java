package com.basant.spring.profile.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basant.spring.profile.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
