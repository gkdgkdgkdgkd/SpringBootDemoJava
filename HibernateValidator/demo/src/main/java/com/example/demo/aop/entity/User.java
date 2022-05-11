package com.example.demo.aop.entity;

import com.example.demo.aop.annotation.MyEmail;
import com.example.demo.aop.annotation.MyPhone;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    @MyPhone(order = 1)
    private String phone;
    @MyEmail(order = 2)
    private String email;
}
