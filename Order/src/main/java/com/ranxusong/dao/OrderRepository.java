package com.ranxusong.dao;

import com.ranxusong.entity.Clist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderRepository extends JpaRepository<Clist,Integer>, JpaSpecificationExecutor<Clist> {
}
