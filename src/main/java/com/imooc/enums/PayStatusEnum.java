package com.imooc.enums;

import lombok.Getter;

/**
 * 支付状态枚举
 * @auther lhtao
 * @date 2018-11-28 9:58
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
