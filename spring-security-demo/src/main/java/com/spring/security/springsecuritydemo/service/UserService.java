package com.spring.security.springsecuritydemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.security.springsecuritydemo.dto.UserDto;
import com.spring.security.springsecuritydemo.model.User;

public interface UserService extends UserDetailsService {
    public User saveUser(UserDto userDto);
}
