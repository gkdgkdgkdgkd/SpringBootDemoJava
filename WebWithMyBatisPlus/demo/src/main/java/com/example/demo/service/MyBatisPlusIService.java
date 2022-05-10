package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserMapper;
import com.example.demo.dao.UserService;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBatisPlusIService extends ServiceImpl<UserMapper, User> implements UserService {
    public boolean save(User user) {
        if (getById(user.getId()) != null) {
            return updateById(user);
        }
        return super.save(user);
    }

    public boolean delete(Long id) {
        return removeById(id);
    }

    public User select(Long id) {
        return getById(id);
    }

    public List<User> selectAll() {
        return list();
    }
}
