package com.anonymity.goodsmanagement.controller;

import com.anonymity.goodsmanagement.entity.Goods;
import com.anonymity.goodsmanagement.service.GoodsService;
import com.anonymity.goodsmanagement.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anonymity
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }


    /**
     * 添加商品
     *
     * @return 添加消息
     */
    @RequestMapping(method = {RequestMethod.POST})
    public Result addGoods(Goods goods) {
        goodsService.addGoods(goods);
        return new Result(Result.SUCCESS, "添加成功", null);
    }

    /**
     * 更新商品
     *
     * @return 更新消息
     */
    @RequestMapping(method = {RequestMethod.PUT})
    public Result updateGoods(Goods goods) {
        goodsService.updateGoods(goods);
        return new Result(Result.SUCCESS, "更新成功", null);
    }

    /**
     * 删除商品
     *
     * @return 返回删除成功信息
     */
    @RequestMapping(method = {RequestMethod.DELETE})
    public Result deleteGoods(@RequestParam("goodsSn") String... goodsSn) {
        goodsService.deleteGoods(goodsSn);
        return new Result(Result.SUCCESS, "删除成功", null);
    }

    /**
     * 获取商品
     *
     * @return 商品信息
     */
    @RequestMapping(method = {RequestMethod.GET})
    public Result getGoods(String goodsName, Integer pageNum, Integer pageSize) {
        if (pageNum != null && pageSize != null) {
            PageHelper.startPage(pageNum, pageSize);
        }
        return new Result(Result.SUCCESS, "查询成功", goodsService.getGoods(goodsName));
    }
}
