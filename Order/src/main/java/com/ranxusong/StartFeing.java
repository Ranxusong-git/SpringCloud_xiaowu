package com.ranxusong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EntityScan("com.ranxusong")
@ComponentScan("com.ranxusong.*")
public class StartFeing {
    public static void main(String[] args) {
        SpringApplication.run(StartFeing.class,args);
    }
}
