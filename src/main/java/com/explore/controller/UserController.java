package com.explore.controller;

import com.explore.entity.master.User;
import com.explore.service.master.UserService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户控制器类
 *
 * @Author HaiQing.Yu
 * @Date 2022/10/8 11:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/sayHello/{userId}")
    public String sayHello(@PathVariable Long userId){

        User user = userService.getById(userId);
        if(ObjectUtils.isEmpty(user)){
            return "此用户不存在";
        }
        return user.getName() + ",你好!";
    }

}
