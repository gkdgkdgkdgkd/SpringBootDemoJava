package com.example.demo.customed.entity;

import com.example.demo.customed.annotation.MyPhone;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    @MyPhone
    private String phone;
    private String email;
}
