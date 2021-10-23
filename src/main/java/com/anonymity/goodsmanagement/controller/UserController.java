package com.anonymity.goodsmanagement.controller;

import com.anonymity.goodsmanagement.entity.User;
import com.anonymity.goodsmanagement.service.UserService;
import com.anonymity.goodsmanagement.utils.Result;
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
    public Result login(@RequestParam("userSn") String userSn, @RequestParam("userPwd") String userPwd, HttpSession session) {
        User user = new User(userSn, userPwd);
        User online = userService.login(user);
        if (user.equals(online)) {
            session.setAttribute("userSn", userSn);
            return new Result(Result.SUCCESS, "登录成功", online);
        } else {
            return new Result(Result.FAILURE, "登录失败", null);
        }
    }

    @RequestMapping("/register")
    public Result register(@RequestParam("userSn") String userSn, @RequestParam("userPwd") String userPwd) {
        User user = new User(userSn, userPwd);
        userService.register(user);
        User login = userService.login(user);
        if (login != null) {
            return new Result(Result.SUCCESS, "注册成功", login);
        } else {
            return new Result(Result.FAILURE, "注册失败", null);
        }
    }
}
