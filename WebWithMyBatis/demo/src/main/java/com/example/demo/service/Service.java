package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Service {
    private final UserMapper mapper;

    public boolean save(User user) {
        String id = user.getId();
        User currentUser = select(id);
        if (currentUser != null)
            return mapper.update(user) == 1;
        return mapper.insert(user) == 1;
    }

    public boolean delete(String id) {
        return mapper.deleteById(id) == 1;
    }

    public User select(String id) {
        return mapper.selectById(id);
    }

    public List<User> selectAll() {
        return mapper.selectAll();
    }
}