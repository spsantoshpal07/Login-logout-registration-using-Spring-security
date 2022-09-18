package com.spring.security.springsecuritydemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.security.springsecuritydemo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
