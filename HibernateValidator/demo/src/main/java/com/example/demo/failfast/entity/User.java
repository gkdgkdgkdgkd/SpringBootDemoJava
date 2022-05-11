package com.example.demo.failfast.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class User {
    @NotBlank(message = "电话不能为空")
    private String phone;
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱非法")
    private String email;
}
