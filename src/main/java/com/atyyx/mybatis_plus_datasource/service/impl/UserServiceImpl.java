package com.atyyx.mybatis_plus_datasource.service.impl;

import com.atyyx.mybatis_plus_datasource.mapper.UserMapper;
import com.atyyx.mybatis_plus_datasource.pojo.User;
import com.atyyx.mybatis_plus_datasource.service.UserService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/14 0:52
 */
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
