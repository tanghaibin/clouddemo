package com.example.consumer.feign;

import com.haibin.common.vo.JsonResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author haibin.tang
 * @create 2018-07-01 10:52
 **/
@FeignClient("provide")
public interface UserFeign {

    @RequestMapping(method = RequestMethod.GET, value = "user/get")
    JsonResult get();
}
