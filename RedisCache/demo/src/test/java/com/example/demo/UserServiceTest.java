package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class UserServiceTest {
    private final UserService service;

    @Test
    public void select() {
        System.out.println(service.select(1L));
        System.out.println(service.select(1L));
    }

    @Test
    public void selectAll() {
        System.out.println(service.selectAll());
        System.out.println(service.selectAll());
    }

    @Test
    public void delete() {
        System.out.println(service.delete(1L));
        System.out.println(service.delete(1L));
    }

    @Test
    public void save() {
        User user = new User(1L, "name1");
        System.out.println(service.save(user));
        System.out.println(service.select(user.getId()));
        user.setName("name2");
        System.out.println(service.save(user));
        System.out.println(service.select(user.getId()));
    }
}
