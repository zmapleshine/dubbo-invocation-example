package com.example.dubbo.service2.controller;


import com.example.dubbo.api.entity.Order;
import com.example.dubbo.api.service.OrderService;
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
@RequestMapping("orders")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders(Order.builder().userId(0).build());
    }
}
