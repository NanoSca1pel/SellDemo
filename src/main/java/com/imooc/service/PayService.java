package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * 支付
 * @author lhtao
 * @date 2019-01-18 15:04
 */
public interface PayService {

    /** 创建支付订单*/
    PayResponse create(OrderDTO orderDTO);

    /** 微信异步通知处理*/
    PayResponse notify(String notifyData);

    /** 申请退款*/
    RefundResponse refund(OrderDTO orderDTO);
}
