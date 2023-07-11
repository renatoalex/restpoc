package com.ramp.poc.restpoc.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramp.poc.restpoc.model.User;
import com.ramp.poc.restpoc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> findAll() {
        Iterable<User> iterable = repository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public User findById(final Long id) {
        Optional<User> findById = repository.findById(id);
        return findById.get();
    }

    @Override
    public User findByUsername(final String username) {
        Optional<User> findByUsername = Optional.of(repository.findByUsername(username));
        return findByUsername.get();
    }

    @Override
    public User update(Long id, User user) {
        Optional<User> findById = repository.findById(id);
        findById.ifPresent((updatedUser) -> {
            updatedUser.setUsername(user.getUsername());
            repository.save(updatedUser);
        });

        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }
}
