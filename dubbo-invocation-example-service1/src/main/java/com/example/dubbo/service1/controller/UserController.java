package com.example.dubbo.service1.controller;

import com.example.dubbo.api.entity.User;
import com.example.dubbo.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zmapleshine
 * @date 2020/5/25 19:50
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> getByProvider() {
        List<User> list = userService.list();
        for (User user : list) {
            user.setUsername(user.getUsername() + "@example.com");
        }
        return list;
    }
}
