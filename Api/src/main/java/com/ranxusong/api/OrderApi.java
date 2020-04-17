package com.ranxusong.api;

import com.ranxusong.entity.Clist;
import com.ranxusong.entity.Pages;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderApi {
    //列表
    List<Clist> OrderList();
    //分页列表
    Page<Clist> listpage(Pages pages);

    void addOrder(Clist clist);

    void deleteOrder(Integer id);
}
