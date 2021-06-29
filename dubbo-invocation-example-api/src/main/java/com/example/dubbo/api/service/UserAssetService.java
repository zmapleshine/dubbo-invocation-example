package com.example.dubbo.api.service;


import com.example.dubbo.api.entity.UserAsset;

import java.util.List;

/**
 * @author zmapleshine
 * @date 2020/5/25 11:33
 */
public interface UserAssetService {
    List<UserAsset> list();

    UserAsset get(Integer userId);
}
