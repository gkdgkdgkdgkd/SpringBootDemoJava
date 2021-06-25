package com.example.demo.test.mapper;

import com.example.demo.test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-06-25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
