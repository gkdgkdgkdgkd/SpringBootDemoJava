package com.example.demo.user.mapper;

import com.example.demo.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2022-05-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
