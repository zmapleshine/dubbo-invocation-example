package com.example.dubbo.service1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zmapleshine
 * @date 2020/5/28 22:01
 */
@Configuration
@ImportResource({"classpath:dubbo/*.xml"})
public class DubboAutoConfiguration {
}
