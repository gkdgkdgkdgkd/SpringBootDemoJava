package com.example.demo.aop.controller;

import com.example.demo.aop.annotation.UserValidate;
import com.example.demo.aop.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPController {
    @PostMapping("/aop")
    @UserValidate
    public String test(@RequestBody User user) {
        return "valid";
    }
}
