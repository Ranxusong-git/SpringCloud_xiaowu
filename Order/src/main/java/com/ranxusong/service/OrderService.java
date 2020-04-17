package com.ranxusong.service;

import com.ranxusong.dao.OrderRepository;
import com.ranxusong.entity.Clist;
import com.ranxusong.entity.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Clist> OrderList(){
        return orderRepository.findAll();
    }
    public Page<Clist> listpage(Pages pages){
        Pageable pageable=new PageRequest(pages.getPageNum(),pages.getPageNum(), Sort.Direction.ASC,"id");
        return orderRepository.findAll(pageable);
    }

    public void addOrder(Clist clist){
        orderRepository.save(clist);
    }

    public void delete(Integer id){
        orderRepository.deleteById(id);
    }
}
