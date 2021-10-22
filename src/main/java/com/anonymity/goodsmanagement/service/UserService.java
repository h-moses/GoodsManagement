package com.anonymity.goodsmanagement.service;

import com.anonymity.goodsmanagement.entity.User;

/**
 * @author anonymity
 */
public interface UserService {

    User login(User user);

    void register(User user);
}
