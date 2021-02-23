package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper{
    @Select("select * from user where id=#{id}")
    User selectById(@Param("id") String id);

    @Select("select * from user")
    List<User> selectAll();

    int insert(@Param("user") User user);

    int deleteById(@Param("id") String id);

    int update(@Param("user") User user);
}
