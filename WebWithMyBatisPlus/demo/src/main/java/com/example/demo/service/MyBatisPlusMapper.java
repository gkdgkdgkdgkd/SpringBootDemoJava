package com.example.demo.service;


import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusMapper {
    private final UserMapper mapper;

    public boolean save(User user) {
        if (mapper.selectById(user.getId()) != null) {
            return mapper.updateById(user) == 1;
        }
        return mapper.insert(user) == 1;
    }

    public boolean delete(Long id) {
        return mapper.deleteById(id) == 1;
    }

    public User select(Long id) {
        return mapper.selectById(id);
    }

    public List<User> selectAll() {
        return mapper.selectList(null);
    }
}
