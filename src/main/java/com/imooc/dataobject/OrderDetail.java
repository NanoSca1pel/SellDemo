package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单明细
 * @auther lhtao
 * @date 2018-11-28 10:04
 */
@Entity
@Data
public class OrderDetail {

    /** 明细id */
    @Id
    private String detailId;

    /** 订单id */
    private  String orderId;

    /** 商品id */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private String productIcon;


}
