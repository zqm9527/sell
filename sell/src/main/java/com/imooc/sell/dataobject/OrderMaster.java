package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@Data
public class OrderMaster {
    @Id
    private String orderId;
    private String buyerName;//'买家名字',
    private String buyerPhone;//'买家电话',
    private String buyerAddress;//买家地址',
    private String buyerOpenid;//'买家微信的openid',
    private BigDecimal orderAmount;//'订单总金额',
    private int orderStatus;// '订单状态,默认0新下单',
    private int payStatus; //'支付状态,默认0未支付',
}
