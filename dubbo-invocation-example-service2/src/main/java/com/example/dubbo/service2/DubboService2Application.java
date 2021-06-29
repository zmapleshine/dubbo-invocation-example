package com.example.dubbo.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zmapleshine
 * @date 2020/5/25 11:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboService2Application {
    public static void main(String[] args) {
        SpringApplication.run(DubboService2Application.class, args);
    }
}
