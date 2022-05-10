package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.MyBatisPlusMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapper/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusMapperController {
    private final MyBatisPlusMapper myBatisPlusMapper;

    @GetMapping("select/id")
    public User select1(@RequestParam Long id) {
        return myBatisPlusMapper.select(id);
    }

    @GetMapping("select/id/{id}")
    public User select2(@PathVariable("id") Long id) {
        return myBatisPlusMapper.select(id);
    }

    @GetMapping("select/all")
    public List<User> selectAll() {
        return myBatisPlusMapper.selectAll();
    }

    @GetMapping("delete")
    public boolean delete1(@RequestParam Long id) {
        return myBatisPlusMapper.delete(id);
    }

    @GetMapping("delete/{id}")
    public boolean delete2(@PathVariable("id") Long id) {
        return myBatisPlusMapper.delete(id);
    }

    @PostMapping("save")
    public boolean save(@RequestBody User user) {
        return myBatisPlusMapper.save(user);
    }
}
