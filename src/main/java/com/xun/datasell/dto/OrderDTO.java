package com.xun.datasell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xun.datasell.dataobject.OrderDetail;
import com.xun.datasell.utils.serializer.Date2Long;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    @JsonSerialize(using = Date2Long.class)
    private Date createTime;
    @JsonSerialize(using = Date2Long.class)
    private Date updateTime;
    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
