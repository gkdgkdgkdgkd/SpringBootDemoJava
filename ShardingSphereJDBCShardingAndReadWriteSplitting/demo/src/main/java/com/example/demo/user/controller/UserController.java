package com.example.demo.user.controller;


import com.example.demo.user.entity.User;
import com.example.demo.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-07-06
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final Random random = new Random();
    private final UserServiceImpl service;
    @GetMapping("/select")
    public List<User> select(){
        return service.list();
    }

    @GetMapping("/insert")
    public boolean insert(){
        return service.save(User.builder().age(random.nextInt(80)+20).name("test name").email("test@test.com").build());
    }
}

