package com.xun.datasell;

import com.xun.datasell.dataobject.ProductInfo;
import com.xun.datasell.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public void saveProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2333333");
        productInfo.setProductName("抖音视频资料");
        productInfo.setProductPrice(new BigDecimal(2.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("便宜卖了");
        productInfo.setProductIcon("******.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(5);
        ProductInfo result = productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByStatus() {
        List<ProductInfo> productInfos = productInfoRepository.findByProductStatusIn(0);
        Assert.assertNotEquals(0,productInfos.size());
    }
}
