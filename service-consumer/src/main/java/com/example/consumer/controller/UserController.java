package com.example.consumer.controller;

import com.example.consumer.feign.UserFeign;
import com.haibin.common.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haibin.tang
 * @create 2018-07-01 10:22
 **/
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("get")
    public JsonResult get() {
        return userFeign.get();
    }
}
