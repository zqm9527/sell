package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
@Autowired
private OrderMasterRepository repository;
    @Test
    public void save() {
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("订单0000001");
        orderMaster.setBuyerAddress("怡丰公寓728");
        orderMaster.setBuyerName("曾庆勉");
        orderMaster.setBuyerOpenid("微信号13620092263");
        orderMaster.setBuyerPhone("13620092263");
        orderMaster.setOrderAmount(new BigDecimal(10000));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster= repository.save(orderMaster);
        Assert.assertNotNull(orderMaster);
    }
}