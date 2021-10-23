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

    Integer addGoods(@Param("goods") Goods goods);

    Integer deleteGoods(@Param("goodsSn") String... goodsSn);

    Integer updateGoods(@Param("goods") Goods goods);
}
