package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.MyBatisPlusMapper;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusMapperTest {
    private final MyBatisPlusMapper myBatisPlusMapper;

    @Test
    void save() {
        myBatisPlusMapper.save(new User(4L, "Mapper-username", "Mapper-password"));
    }

    @Test
    void delete() {
        myBatisPlusMapper.delete(3L);
    }

    @Test
    void select() {
        System.out.println(myBatisPlusMapper.select(1L));
    }

    @Test
    void selectAll() {
        myBatisPlusMapper.selectAll().forEach(System.out::println);
    }
}
