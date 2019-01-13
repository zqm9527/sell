package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.repository.OrderDetailRepository;
import com.imooc.sell.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
   @Autowired
    private OrderDetailRepository repository;
    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return repository.save(orderDetail);
    }
}
