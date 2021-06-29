package com.example.dubbo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zmapleshine
 * @date 2020/5/25 11:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAsset implements Serializable {
    private static final long serializeVersion = -1;
    private Integer id;
    private Integer userId;
    private BigDecimal amount;

}
