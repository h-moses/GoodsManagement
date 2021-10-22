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
public class User {
    private String userSn;
    private String userPwd;
}
