package com.anonymity.goodsmanagement.dao;

import com.anonymity.goodsmanagement.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author anonymity
 */
@Repository
public interface GoodsDao {
    Goods queryGoods(@Param("goodsSn") String goodsSn);

    void addGoods(@Param("goods") Goods goods);

    void deleteGoods(@Param("goodsSn") String... goodsSn);

    void updateGoods(@Param("goods") Goods goods);
}
