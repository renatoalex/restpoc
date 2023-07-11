package com.ramp.poc.restpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramp.poc.restpoc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);
}