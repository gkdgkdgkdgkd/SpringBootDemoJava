package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CRUDController {
    private final Service service;

    @PostMapping("save")
    public boolean save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("delete")
    public boolean delete(@RequestParam String id) {
        return service.delete(id);
    }

    @GetMapping("select")
    public User select(@RequestParam String id) {
        return service.select(id);
    }

    @GetMapping("selectAll")
    public List<User> selectAll() {
        return service.selectAll();
    }
}
