package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailServiceImplTest {
    @Autowired
    private OrderDetailServiceImpl service;
    @Test
    public void save(){
        OrderDetail o=new OrderDetail();
        o.setDetailId("1");
        o.setOrderId("11");
        o.setProductIcon("xxx.xxx.xxx");
        o.setProductId("1");
    }

}