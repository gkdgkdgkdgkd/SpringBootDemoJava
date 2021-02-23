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
        service.select(1);
        service.select(1);
    }

    @Test
    void selectAll(){
        service.selectAll();
        service.selectAll();
    }

    @Test
    void delete(){
        service.delete(1);
    }

    @Test
    void save(){
        User user = new User(1,"name1");
        service.save(user);
        service.select(user.getId());
        user.setName("name2");
        service.save(user);
        service.select(user.getId());
    }
}