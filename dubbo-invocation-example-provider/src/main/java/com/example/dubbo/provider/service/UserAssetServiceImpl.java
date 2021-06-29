package com.example.dubbo.provider.service;

import com.example.dubbo.api.entity.UserAsset;
import com.example.dubbo.api.service.UserAssetService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zmapleshine
 * @date 2020/6/2 20:28
 */
@Service
public class UserAssetServiceImpl implements UserAssetService {


    @Override
    public List<UserAsset> list() {
        List<UserAsset> userAssets = new ArrayList<>();
        userAssets.add(UserAsset.builder()
                .userId(1)
                .amount(new BigDecimal(new Random().nextInt(99999))).build());
        userAssets.add(UserAsset.builder()
                .userId(2)
                .amount(new BigDecimal(new Random().nextInt(99999))).build());
        return userAssets;
    }

    @Override
    public UserAsset get(Integer userId) {
        return UserAsset.builder()
                .userId(userId)
                .id(userId)
                .amount(new BigDecimal(new Random().nextInt(99999999)))
                .build();
    }
}
