package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.MyBatisPlusIService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusIServiceTests {
    private final MyBatisPlusIService myBatisPlusIService;
    @Test
    void save()
    {
        myBatisPlusIService.save(new User("4","4444","5555"));
    }

    @Test
    void delete()
    {
        myBatisPlusIService.delete("3");
    }

    @Test
    void select()
    {
        System.out.println(myBatisPlusIService.select("1"));
    }

    @Test
    void selectAll()
    {
        myBatisPlusIService.selectAll().forEach(System.out::println);
    }
}
