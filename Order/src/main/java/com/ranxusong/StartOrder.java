package com.ranxusong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.ranxusong")
@ComponentScan(value = "com.ranxusong.*")
public class StartOrder {
    public static void main(String[] args) {
        SpringApplication.run(StartOrder.class,args);
    }
}
