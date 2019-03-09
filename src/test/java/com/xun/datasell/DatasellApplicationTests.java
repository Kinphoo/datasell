package com.xun.datasell;

import com.xun.datasell.dataobject.ProductCategory;
import com.xun.datasell.repository.ProductCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DatasellApplicationTests {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void contextLoads() {
        log.info("哈哈哈哈哈~~");
        log.error("hehehehhe2");
    }

    @Test
    public void testProductCategoryRepository() {
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        log.info(productCategory.toString());
    }

    @Test
    public void saveTestProductCategoryRepository(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("hhaa不是小孩最爱~");
        productCategory.setCategoryType(5);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void findProductCategorys(){
        List<Integer> list = Arrays.asList(2,5,4);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        log.info(result.toString());
    }

}
