package com.xun.datasell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xun.datasell.dataobject.OrderDetail;
import com.xun.datasell.dto.OrderDTO;
import com.xun.datasell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class OrderForm2OrderDTO {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        List<OrderDetail> orderDetailList = null;

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【对象转换】GSON转换错误 string={}", orderForm.getItems());
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
