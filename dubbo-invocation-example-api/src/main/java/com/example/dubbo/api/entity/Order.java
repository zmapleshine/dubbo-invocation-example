package com.example.dubbo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zmapleshine
 * @date 2020/6/3 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order implements Serializable {
    private Integer id;
    private Integer userId;
    private String description;
    private BigDecimal totalFee;
}
