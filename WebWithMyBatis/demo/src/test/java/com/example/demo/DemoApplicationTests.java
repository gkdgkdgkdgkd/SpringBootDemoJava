package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.Service;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class DemoApplicationTests {

    private final Service service;

    @Test
    void select() {
        System.out.println(service.select("1"));
    }

    @Test
    void selectAll() {
        service.selectAll().forEach(System.out::println);
    }

    @Test
    void delete() {
        service.delete("3");
    }

    @Test
    void save() {
        service.save(new User("3", "username3", "password3"));
    }
}
