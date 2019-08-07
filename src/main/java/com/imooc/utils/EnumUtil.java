package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @author lhtao
 * @date 2019-01-22 15:42
 */
public class EnumUtil {

    public static <K, T extends CodeEnum> T getByCode(K code, Class<T> enumClass){
        for (T each : enumClass.getEnumConstants()){
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
