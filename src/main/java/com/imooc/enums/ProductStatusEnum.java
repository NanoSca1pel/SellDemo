package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @auther lhtao
 * @date 2018-11-27 15:25
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"已上架"),
    DOWN(1,"已下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
