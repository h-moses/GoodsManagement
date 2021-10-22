package com.anonymity.goodsmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author anonymity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsId;
    private String goodsSn;
    private String goodsName;
    private Double shopPrice;
    private Integer goodsStock;
    private String goodsUnit;
    private Integer saleNum;
}
