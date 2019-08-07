package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 推送消息
 * @author lhtao
 * @date 2019-01-24 17:16
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
