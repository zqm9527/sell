package com.imooc.sell.service.impl;
import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl service;
    @Test
    public void findOne() {
        ProductCategory productCategory= service.findOne(1);
     //   Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> l= service.findAll();
        Assert.assertNotEquals(0,l.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> l=service.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,l.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory("男生专享",66);
        productCategory= service.save(productCategory);
        Assert.assertNotEquals(null,productCategory);
    }
}