package com.anonymity.goodsmanagement.controller;

import com.anonymity.goodsmanagement.entity.User;
import com.anonymity.goodsmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author anonymity
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public User login(@RequestParam("userSn") String userSn, @RequestParam("userPwd") String userPwd, HttpSession session) {
        User user = new User(userSn, userPwd);
        User online = userService.login(user);
        if (user.equals(online)) {
            session.setAttribute("userSn", userSn);
            return user;
        } else {
            return null;
        }
    }

    @RequestMapping("/register")
    public User register(@RequestParam("userSn") String userSn, @RequestParam("userPwd") String userPwd) {
        User user = new User(userSn, userPwd);
        userService.register(user);
        return userService.login(user);
    }
}
