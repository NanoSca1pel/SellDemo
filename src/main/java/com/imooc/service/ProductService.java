package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @auther lhtao
 * @date 2018-11-27 15:06
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有上架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /** 加库存 */
    void increaseStock(List<CartDTO> cartDTOList);

    /** 减库存 */
    void decreaseStock(List<CartDTO> cartDTOList);

    /** 上架 */
    ProductInfo onSale(String productId);

    /** 下架 */
    ProductInfo offSale(String productId);
}
