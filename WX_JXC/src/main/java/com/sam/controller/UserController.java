package com.sam.controller;

import com.sam.pojo.User;
import com.sam.pojo.UserExample;
import com.sam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 17:09
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController<User, UserExample> {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        this.baseService = userService;
    }
}
