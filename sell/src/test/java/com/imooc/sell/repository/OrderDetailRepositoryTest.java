package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
@Autowired
private OrderDetailRepository repository;
    @Test
    public void save() {
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setProductName("粥");
        orderDetail.setProductId("0001");
        orderDetail.setProductIcon("xxx.xxx.xxx");
        orderDetail.setOrderId("订单001");

    }
}