package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * @auther lhtao
 * @date 2018-11-28 13:35
 */
@Data
public class CartDTO {

    /** 商品id */
    private String productId;

    /** 商品数量 */
    private  Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
