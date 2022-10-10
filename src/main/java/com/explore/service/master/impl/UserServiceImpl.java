package com.explore.service.master.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.explore.entity.master.User;
import com.explore.mapper.master.UserMapper;
import com.explore.service.master.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuhaiqing
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-10-09 14:29:06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}




