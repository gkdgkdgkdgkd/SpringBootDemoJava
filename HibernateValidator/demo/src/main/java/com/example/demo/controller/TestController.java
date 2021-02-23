package com.example.demo.controller;

import com.example.demo.aop.UserValidate;
import com.example.demo.entity.User;
import com.example.demo.failfast.FailFastValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import java.util.Set;

@CrossOrigin(value = "http://localhost:3000")
@RestController
public class TestController {
    @PostMapping("/test")
    @UserValidate
    public String test(@RequestBody User user)
    {
        return "true";
    }
}
