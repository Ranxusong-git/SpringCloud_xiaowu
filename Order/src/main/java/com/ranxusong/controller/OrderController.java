package com.ranxusong.controller;

import com.ranxusong.api.OrderApi;
import com.ranxusong.entity.Clist;
import com.ranxusong.entity.Pages;
import com.ranxusong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController implements OrderApi {
    @Autowired
    OrderService orderService;
    @Override
    @GetMapping("/list")

    public List<Clist> OrderList() {
        return orderService.OrderList();
    }

    @Override
    @PostMapping("/listpage")
    public Page<Clist> listpage(@RequestBody Pages pages) {
        return orderService.listpage(pages);
    }

    @Override
    @RequestMapping("/add")
    public void addOrder(@RequestBody Clist clist) {
        //测试
        Clist clist1 = new Clist();
        clist1.setCname("java");
        clist1.setPrice(1000.0);
        clist1.setNumber(3);
        orderService.addOrder(clist1);
    }

    @Override
    @RequestMapping("delete")
    public void deleteOrder(Integer id) {
        orderService.delete(id);
    }
}
