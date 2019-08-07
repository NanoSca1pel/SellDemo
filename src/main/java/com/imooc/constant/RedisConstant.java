package com.imooc.constant;

/**
 * redis常量
 * @author lhtao
 * @date 2019-01-24 14:41
 */
public interface RedisConstant {

    /** token前缀 */
    String TOKEN_PREFIX = "token_%s";

    /** 过期时间 2小时*/
    Integer EXPIRE = 7200;
}
