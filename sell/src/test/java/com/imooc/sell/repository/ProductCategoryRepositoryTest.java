package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.print(productCategory);
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生22最爱", 6);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeIn() {
        List l = repository.findByCategoryTypeIn(Arrays.asList(2, 3, 10));
        Assert.assertNotEquals(0, l);
    }

}