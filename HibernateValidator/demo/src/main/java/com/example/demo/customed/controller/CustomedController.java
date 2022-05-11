package com.example.demo.customed.controller;

import com.example.demo.customed.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomedController {
    @PostMapping("/customed")
    public String test(@RequestBody @Valid User user, BindingResult result) {
        if (!result.hasErrors()) {
            return "valid";
        }
        StringBuilder builder = new StringBuilder();
        result.getAllErrors().forEach(t -> {
            builder.append(t.getDefaultMessage()).append('\n');
        });
        return builder.toString();
    }
}
