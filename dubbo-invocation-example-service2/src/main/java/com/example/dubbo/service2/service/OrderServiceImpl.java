package com.example.dubbo.service2.service;

import com.example.dubbo.api.entity.Order;
import com.example.dubbo.api.service.OrderService;
import com.example.dubbo.api.service.UserAssetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zmapleshine
 * @date 2020/6/3 11:49
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private UserAssetService userAssetService;

    @Override
    public List<Order> getOrders(Order order) {
        userAssetService.get(1);

        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            orders.add(Order.builder()
                    .totalFee(new BigDecimal(new Random().nextInt(999)))
                    .description("User " + order.getUserId() + "goods" + new Random().nextInt(10101))
                    .build()
            );
        }
        return orders;
    }
}
