package com.example.spring_security_demo.controller;

import com.example.spring_security_demo.entity.Users;
import com.example.spring_security_demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return usersService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return usersService.verify(user);
    }
}
