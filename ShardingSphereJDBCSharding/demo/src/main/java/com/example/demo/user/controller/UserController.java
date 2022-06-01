package com.example.demo.user.controller;

import com.example.demo.user.entity.User;
import com.example.demo.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author author
 * @since 2022-05-28
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final IUserService userService;

    @GetMapping("/insert")
    public boolean insert() {
        return userService.save(User.builder().name("name").age(new Random().nextInt(100) + 1).build());
    }

    @GetMapping("/select")
    public List<User> select() {
        return userService.list();
    }
}
