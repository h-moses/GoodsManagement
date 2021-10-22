package com.anonymity.goodsmanagement.service;

import com.anonymity.goodsmanagement.entity.Goods;

import java.util.List;

/**
 * @author anonymity
 */
public interface GoodsService {

    List<Goods> getGoods(String goodsName);

    void addGoods(Goods goods);

    void deleteGoods(String... goodsSn);

    void updateGoods(Goods goods);
}
