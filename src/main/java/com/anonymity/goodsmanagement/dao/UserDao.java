package com.anonymity.goodsmanagement.dao;

import com.anonymity.goodsmanagement.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author anonymity
 */
@Repository
public interface UserDao {

    User queryUser(@Param("user") User user);

    void insertUser(@Param("user") User user);
}
