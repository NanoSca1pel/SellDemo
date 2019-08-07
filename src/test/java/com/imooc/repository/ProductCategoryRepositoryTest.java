package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.println("开始");
        System.out.println(productCategory.toString());
        System.out.println("结束");
    }

    @Test
    @Transactional
    public void saveTest(){
       /* ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(2);*/

       /*ProductCategory productCategory = repository.findById(2).orElse(null);
       if (productCategory != null){
           productCategory.setCategoryType(3);
       }*/


       ProductCategory productCategory = new ProductCategory("女生最爱",3);
       ProductCategory result = repository.save(productCategory);
       Assert.assertNotNull(result);
       //assertNotEquals(不期望的,实际的)
       //Assert.assertNotEquals(null,result);
    }


    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result);
    }
}