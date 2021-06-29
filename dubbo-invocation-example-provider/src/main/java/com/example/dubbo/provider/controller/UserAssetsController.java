package com.example.dubbo.provider.controller;

import com.example.dubbo.api.entity.UserAsset;
import com.example.dubbo.api.service.UserAssetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zmapleshine
 * @date 2020/5/25 19:46
 */
@RestController
@RequestMapping("user-assets")
public class UserAssetsController {

    @Resource
    private UserAssetService userAssetService;

    @GetMapping
    public List<UserAsset> getUsers() {
        return userAssetService.list();
    }
}
