package com.example.demo.user.service.impl;

import com.example.demo.user.entity.User;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2022-05-28
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
