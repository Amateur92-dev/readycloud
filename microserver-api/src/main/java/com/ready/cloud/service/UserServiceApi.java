package com.ready.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microserver-service")
public interface UserServiceApi {
    @RequestMapping("/user/get")
    String getUer();
}
