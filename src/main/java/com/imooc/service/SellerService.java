package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @author lhtao
 * @date 2019-01-24 10:22
 */
public interface SellerService {

    /**
     * 根据openid查询卖家信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
