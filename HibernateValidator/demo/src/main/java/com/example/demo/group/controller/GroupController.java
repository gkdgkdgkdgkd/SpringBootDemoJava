package com.example.demo.group.controller;

import com.example.demo.group.entity.User;
import com.example.demo.group.groups.group.SignInCheckSequenceGroup;
import com.example.demo.group.groups.group.SignUpCheckSequenceGroup;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group/")
public class GroupController {
    @PostMapping("sign/in")
    public String signIn(@RequestBody @Validated(SignInCheckSequenceGroup.class) User user, BindingResult result) {
        if (!result.hasErrors()) {
            return "valid";
        }
        StringBuilder builder = new StringBuilder();
        result.getAllErrors().forEach(t -> {
            builder.append(t.getDefaultMessage()).append('\n');
        });
        return builder.toString();
    }

    @PostMapping("sign/up")
    public String signUp(@RequestBody @Validated(SignUpCheckSequenceGroup.class) User user, BindingResult result) {
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
