package com.ready.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {


    @RequestMapping(value = "get")
    public String getUser() {
     return "hello ribbon 9001";
    }
}
