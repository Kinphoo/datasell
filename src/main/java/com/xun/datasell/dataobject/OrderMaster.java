package com.xun.datasell.dataobject;

import com.xun.datasell.enums.OrderStatus;
import com.xun.datasell.enums.PayStatus;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    private String buyerName;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus = OrderStatus.NEW.getCode();
    private Integer payStatus = PayStatus.WAIT.getCode();
    private Date createTime;
    private Date updateTime;
}
