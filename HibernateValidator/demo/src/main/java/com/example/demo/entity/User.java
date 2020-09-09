package com.example.demo.entity;

import com.example.demo.aop.MyEmail;
import com.example.demo.aop.MyPhone;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    @MyEmail(order = 2)
    private String email;
    @MyPhone(order = 1)
    private String phone;
}
