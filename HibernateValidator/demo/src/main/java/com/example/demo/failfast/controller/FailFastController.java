package com.example.demo.failfast.controller;

import com.example.demo.failfast.entity.User;
import com.example.demo.failfast.validator.FailFastValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FailFastController {
    private final FailFastValidator validator;

    @PostMapping("/failfast")
    public String test(@RequestBody User user) {
        var error = validator.validate(user);
        return error.size() == 0 ? "valid" : error.stream().findFirst().get().getMessage();
    }
}
