package com.example.demo.test.controller;


import com.example.demo.test.entity.User;
import com.example.demo.test.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-06-25
 */
@RestController
@RequestMapping("/test/user")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserServiceImpl userService;
    @GetMapping("/write")
    public boolean write(){
        return userService.save(User.builder().id(2).age(3).name("234").build());
    }

    @GetMapping("/read")
    public User read(){
        return userService.getById(1);
    }
}

