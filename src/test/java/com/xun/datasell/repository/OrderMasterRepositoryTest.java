package com.xun.datasell.repository;

import com.xun.datasell.dataobject.OrderMaster;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterRepositoryTest {
    @Autowired
    OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("11117");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerOpenid("2346");
        orderMaster.setOrderAmount(new BigDecimal(100));
        orderMaster.setOrderStatus(1);
        orderMaster.setPayStatus(2);
        orderMasterRepository.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = new PageRequest(0,3);
        Page<OrderMaster> orderMasterList = orderMasterRepository.findByBuyerOpenid("2346",pageRequest);
        log.info(orderMasterList.getContent().size() + " ");
    }
}