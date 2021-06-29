package com.example.dubbo.api.service;


import com.example.dubbo.api.entity.Order;

import java.util.List;

/**
 * @author zmapleshine
 * @date 2020/6/3 11:46
 */
public interface OrderService {

    List<Order> getOrders(Order order);
}
