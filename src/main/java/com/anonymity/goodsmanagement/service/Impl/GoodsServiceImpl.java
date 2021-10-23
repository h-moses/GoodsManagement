package com.anonymity.goodsmanagement.service.Impl;

import com.anonymity.goodsmanagement.dao.GoodsDao;
import com.anonymity.goodsmanagement.entity.Goods;
import com.anonymity.goodsmanagement.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Goods> getGoods(String goodsName) {
        return goodsDao.queryGoods(goodsName);
    }

    @Override
    public Integer addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    @Override
    public Integer deleteGoods(String... goodsSn) {
        return goodsDao.deleteGoods(goodsSn);
    }

    @Override
    public Integer updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }
}
