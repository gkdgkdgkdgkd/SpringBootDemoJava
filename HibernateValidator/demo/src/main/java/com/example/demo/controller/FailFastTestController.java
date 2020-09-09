package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.failfast.FailFastValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import java.util.Set;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FailFastTestController {
    private final FailFastValidator validator;
    @PostMapping("/test2")
    public String test(@RequestBody User user)
    {
        Set<ConstraintViolation<User>> message = validator.validate(user);
        for(ConstraintViolation<User> c:message)
            return c.getMessage();
        return "true";
    }
}
