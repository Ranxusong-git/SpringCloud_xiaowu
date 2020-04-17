package com.ranxusong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient
public interface StartFeing {
    @RequestMapping("/update")
    boolean update(@RequestParam int Order,@RequestParam int number);
}
