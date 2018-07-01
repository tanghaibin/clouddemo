package com.example.provode.controller;

import com.haibin.common.vo.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haibin.tang
 * @create 2018-07-01 10:22
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "get")
    public JsonResult get() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "haibin.tang");
        info.put("age", "23");
        info.put("mobile", "18682668023");
        return new JsonResult(info);
    }
}
