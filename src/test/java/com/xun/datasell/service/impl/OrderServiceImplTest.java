package com.xun.datasell.service.impl;

import com.xun.datasell.dataobject.OrderDetail;
import com.xun.datasell.dto.CartDTO;
import com.xun.datasell.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    OrderServiceImpl orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("小李子");
        orderDTO.setBuyerOpenid("110110110");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("2345");
        orderDetail.setProductQuantity(2);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("1234");
        orderDetail2.setProductQuantity(3);

        orderDetailList.add(orderDetail);
        orderDetailList.add(orderDetail2);
        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】result={}", result);
    }

    @Test
    public void findOne() {
        OrderDTO result = orderService.findOne("1551162063958196827");
        log.info("【查询单个订单】result={}", result);
    }

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<OrderDTO> result = orderService.findList("110110110", pageRequest);
        log.info("【查询订单列表】result={}", result);
    }

    @Test
    public void cancel() {
        OrderDTO result = orderService.findOne("1551162063958196827");
        OrderDTO result2 = orderService.cancel(result);
        log.info("【取消订单】订单状态：{}", result2.getOrderStatus());
    }

    @Test
    public void finish() {
        OrderDTO result = orderService.findOne("1551162063958196827");
        OrderDTO result2 = orderService.finish(result);
        log.info("【完结订单】订单状态：{}", result2.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDTO result = orderService.findOne("1551162063958196827");
        OrderDTO result2 = orderService.paid(result);
        log.info("【支付订单】支付状态：{}", result2.getPayStatus());
    }
}