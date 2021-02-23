package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Service {
    private final UserMapper mapper;

    @CachePut(value = "user",key = "#user.id")
    public User save(User user){
        User oldUser = mapper.selectById(user.getId());
        if(oldUser == null){
            mapper.insert(user);
            return user;
        }
        if(mapper.updateById(user) == 1)
            return user;
        return oldUser;
    }

    @CacheEvict(value = "user",key = "#id")
    public boolean delete(Integer id){
        return mapper.deleteById(id) == 1;
    }

    @Cacheable(value = "user",key = "#id")
    public User select(Integer id){
        return mapper.selectById(id);
    }

    @Cacheable(value="allUser",key = "#root.target+#root.methodName")
    public List<User> selectAll(){
        return mapper.selectList(null);
    }
}