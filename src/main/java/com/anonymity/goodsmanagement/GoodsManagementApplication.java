package com.anonymity.goodsmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anonymity
 */
@SpringBootApplication
@MapperScan(basePackages = "com.anonymity.goodsmanagement.dao")
public class GoodsManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsManagementApplication.class, args);
    }

}
