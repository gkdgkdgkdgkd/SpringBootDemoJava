package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserMapper;
import com.example.demo.dao.UserService;
import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyBatisPlusIService extends ServiceImpl<UserMapper,User> implements UserService {
    public boolean save(User user)
    {
        return saveOrUpdate(user);
    }

    public boolean delete(String id)
    {
        return removeById(id);
    }

    public User select(String id)
    {
        return getById(id);
    }

    public List<User> selectAll()
    {
        return list();
    }
}
