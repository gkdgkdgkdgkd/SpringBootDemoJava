package com.example.demo.test.controller;


import com.example.demo.test.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-06-24
 */
@RestController
@RequestMapping("/test/user")
public class UserController {
    @Resource
    private UserServiceImpl userService;
    @GetMapping("/")
    public String test() {
        return userService.getById(1).toString();
    }
}

