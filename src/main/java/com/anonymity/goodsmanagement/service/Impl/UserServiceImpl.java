package com.anonymity.goodsmanagement.service.Impl;

import com.anonymity.goodsmanagement.dao.UserDao;
import com.anonymity.goodsmanagement.entity.User;
import com.anonymity.goodsmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anonymity
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login(User user) {
        return userDao.queryUser(user);
    }

    @Override
    public void register(User user) {
        userDao.insertUser(user);
    }
}
