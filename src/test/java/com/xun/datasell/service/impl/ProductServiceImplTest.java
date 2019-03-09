package com.xun.datasell.service.impl;

import com.xun.datasell.dataobject.ProductInfo;
import com.xun.datasell.repository.ProductInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("2333333");
        log.info(productInfo.getProductDescription());
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage =  productService.findAll(pageRequest);
        log.info(productInfoPage.getTotalElements() + "");
    }

    @Test
    public void save() {
    }
}