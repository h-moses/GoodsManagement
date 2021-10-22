package com.anonymity.goodsmanagement.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author anonymity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    public static final Integer SUCCESS = 200;
    public static final Integer FAILURE = 408;

    private Integer code;
    private String message;
    private Object data;
}
