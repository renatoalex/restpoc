package com.ramp.poc.restpoc.service;

import java.util.List;

import com.ramp.poc.restpoc.model.User;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User findByUsername(String username);

    User update(Long id, User user);

    void deleteById(Long id);

    User create(User user);

}
