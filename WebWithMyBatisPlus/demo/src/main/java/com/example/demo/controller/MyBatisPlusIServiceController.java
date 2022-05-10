package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.MyBatisPlusIService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iservice/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusIServiceController {
    private final MyBatisPlusIService myBatisPlusIService;

    @GetMapping("select/id")
    public User select1(@RequestParam Long id) {
        return myBatisPlusIService.select(id);
    }

    @GetMapping("select/id/{id}")
    public User select2(@PathVariable("id") Long id) {
        return myBatisPlusIService.select(id);
    }

    @GetMapping("select/all")
    public List<User> selectAll() {
        return myBatisPlusIService.selectAll();
    }

    @GetMapping("delete")
    public boolean delete1(@RequestParam Long id) {
        return myBatisPlusIService.delete(id);
    }

    @GetMapping("delete/{id}")
    public boolean delete2(@PathVariable("id") Long id) {
        return myBatisPlusIService.delete(id);
    }

    @PostMapping("save")
    public boolean save(@RequestBody User user) {
        return myBatisPlusIService.save(user);
    }
}
