package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    /* 商品的id*/
    @Id
    private String productId;
    /*'商品名称'*/
    private String productName;
    /*''单价''*/
    private BigDecimal productPrice;
    /*''库存''*/
    private int productStock;
    /*''描述''*/
    private String productDescription;
    /*状态 */
    private int productStatus;
    /*''小图''*/
    private String productIcon;
    /*''类目编号''*/
    private int categoryType;
}
