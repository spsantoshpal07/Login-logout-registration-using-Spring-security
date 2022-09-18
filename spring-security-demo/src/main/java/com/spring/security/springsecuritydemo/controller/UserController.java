package com.spring.security.springsecuritydemo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.springsecuritydemo.dto.UserDto;
import com.spring.security.springsecuritydemo.model.User;
import com.spring.security.springsecuritydemo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    } 

    @PostMapping("/registration")
    public User saveUser(@Valid @RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }
}
