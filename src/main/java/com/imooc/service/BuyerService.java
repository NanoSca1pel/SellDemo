package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * @author lhtao
 * @date 2019-01-17 9:44
 */
public interface BuyerService {

    /** 查询一个订单*/
    OrderDTO findOrderOne(String openid, String orderId);

    /** 取消订单*/
    OrderDTO cancelOrder(String openid, String orderId);

}
