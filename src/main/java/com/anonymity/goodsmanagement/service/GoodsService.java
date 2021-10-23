package com.anonymity.goodsmanagement.service;

import com.anonymity.goodsmanagement.entity.Goods;

import java.util.List;

/**
 * @author anonymity
 */
public interface GoodsService {

    List<Goods> getGoods(String goodsName);

    Integer addGoods(Goods goods);

    Integer deleteGoods(String... goodsSn);

    Integer updateGoods(Goods goods);
}
