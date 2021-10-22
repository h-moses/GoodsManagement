package com.anonymity.goodsmanagement.service;

import com.anonymity.goodsmanagement.entity.Goods;

/**
 * @author anonymity
 */
public interface GoodsService {

    Goods getGoods(String goodsSn);

    void addGoods(Goods goods);

    void deleteGoods(String... goodsSn);

    void updateGoods(Goods goods);
}
