package com.example.dubbo.service1.service;

import com.example.dubbo.api.entity.Order;
import com.example.dubbo.api.entity.User;
import com.example.dubbo.api.service.OrderService;
import com.example.dubbo.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zmapleshine
 * @date 2020/5/25 11:44
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Resource
    private OrderService orderService;

    @Override
    public List<User> list() {
        List<User> list = new ArrayList<>();
        try {
            Thread.sleep(new Random().nextInt(300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BigDecimal amount = new BigDecimal(new Random().nextInt(9999));
        list.add(User.builder()
                .username("uname1")
                .id(1)
                .amount(amount)
                .build());
        list.add(User.builder()
                .username("uname2")
                .id(2)
                .amount(amount)
                .build());
        List<Order> orders = orderService.getOrders(Order.builder().userId(2).build());
        return list;
    }
}
