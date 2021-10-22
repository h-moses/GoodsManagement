package com.anonymity.goodsmanagement.controller;

import com.anonymity.goodsmanagement.entity.Goods;
import com.anonymity.goodsmanagement.service.GoodsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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
     * @return 返回添加成功信息
     */
    @RequestMapping(method = {RequestMethod.POST})
    public String addGoods(Goods goods) {
        goodsService.addGoods(goods);
        return "success";
    }

    /**
     * 更新商品
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.PUT})
    public String updateGoods(Goods goods) {
        goodsService.updateGoods(goods);
        return "success";
    }

    /**
     * 删除商品
     *
     * @return 返回删除成功信息
     */
    @RequestMapping(method = {RequestMethod.DELETE})
    public String deleteGoods(@RequestParam("goodsSn") String... goodsSn) {
        System.out.println(Arrays.toString(goodsSn));
        goodsService.deleteGoods(goodsSn);
        return "success";
    }

    /**
     * 获取商品
     *
     * @return 商品信息
     */
    @RequestMapping(method = {RequestMethod.GET})
    public List<Goods> getGoods(String goodsName, Integer pageNum, Integer pageSize) {
        if (pageNum != null && pageSize != null) {
            PageHelper.startPage(pageNum, pageSize);
        }
        return goodsService.getGoods(goodsName);
    }

}
