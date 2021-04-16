package com.ready.cloud.controller;

import com.ready.cloud.service.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/consumer/user")
public class ComsumerController {

    @Autowired
    RestTemplate restTemplate;


    @Autowired
    UserServiceApi userServiceApi;
   //private  static  final  String REST_PREFIX_URL ="c//localhost:8081/";

    private  static  final  String REST_PREFIX_URL ="http://MICROSERVER-SERVICE";
    @RequestMapping(value = "/get")
    public String getUser(){
       //return restTemplate.getForObject(REST_PREFIX_URL +"/user/get",String.class);

        return userServiceApi.getUer();
    }

}
