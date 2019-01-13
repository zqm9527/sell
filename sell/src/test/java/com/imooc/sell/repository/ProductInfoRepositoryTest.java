package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
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
public class ProductInfoRepositoryTest {
@Autowired
private ProductInfoRepository repository;
    @Test
    public void save() {
        ProductInfo p=new ProductInfo();
        p.setCategoryType(1);
        p.setProductId("0001");
        p.setProductName("粥");
        p.setProductDescription("好喝的粥");
        p.setProductIcon("xxx.xxx.xxx");
        p.setProductPrice(new BigDecimal(5));
        p.setProductStatus(0);
        p.setProductStock(100);
       ProductInfo productInfo= repository.save(p);
        Assert.assertNotNull(productInfo);
    }
    @Test
    public void findByProductStatus() {
        
    }
}