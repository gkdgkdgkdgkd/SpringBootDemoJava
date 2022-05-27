package com.example.demo.user.controller;

import com.example.demo.user.entity.User;
import com.example.demo.user.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author author
 * @since 2022-05-26
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/select")
    public User select() {
        return userService.getById(1);
    }

    @GetMapping("/insert")
    public boolean insert() {
        return userService.saveOrUpdate(User.builder().id(3L).name("name3").build());
    }
}
