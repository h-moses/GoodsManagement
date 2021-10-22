package com.anonymity.goodsmanagement.dao;

import com.anonymity.goodsmanagement.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anonymity
 */
@Repository
public interface GoodsDao {
    List<Goods> queryGoods(@Param("goodsName") String goodsName);

    void addGoods(@Param("goods") Goods goods);

    void deleteGoods(@Param("goodsSn") String... goodsSn);

    void updateGoods(@Param("goods") Goods goods);
}
