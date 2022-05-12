package com.example.demo.custom.entity;

import com.example.demo.custom.annotation.MyPhone;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    @MyPhone
    private String phone;
    private String email;
}
