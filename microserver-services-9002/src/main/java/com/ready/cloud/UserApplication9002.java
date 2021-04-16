package com.ready.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
public class UserApplication9002 {
    public static void main(String[] args) {

        SpringApplication.run(UserApplication9002.class,args);
    }
}
