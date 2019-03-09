package com.xun.datasell.repository;

import com.xun.datasell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("0000");
        orderDetail.setOrderId("1111");
        orderDetail.setProductId("2222");
        orderDetail.setProductName("香草精");
        orderDetail.setProductQuantity(100);
        orderDetail.setProductPrice(new BigDecimal(2.9));
        orderDetail.setProductIcon("xxxxx.png");
        orderDetailRepository.save(orderDetail);
    }

    @Test
    public void findByOrderId() {
    }
}