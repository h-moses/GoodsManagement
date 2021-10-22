package com.anonymity.goodsmanagement.service.Impl;

import com.anonymity.goodsmanagement.dao.GoodsDao;
import com.anonymity.goodsmanagement.entity.Goods;
import com.anonymity.goodsmanagement.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anonymity
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsDao goodsDao;

    @Autowired
    public GoodsServiceImpl(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public Goods getGoods(String goodsSn) {
        return goodsDao.queryGoods(goodsSn);
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void deleteGoods(String... goodsSn) {
        goodsDao.deleteGoods(goodsSn);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }
}