package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Page;
import com.sam.pojo.User;
import com.sam.pojo.UserExample;
import com.sam.service.UserService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Sam_T
 * @date 2020-03-25 17:09
 */
@Controller
@RequestMapping(value = "user", produces = "application/json; charset=utf-8")
public class UserController extends BaseController<User, UserExample> {
    @Value("${user.name}")
    private String name;

    @Value("${user.gender}")
    private String gender;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:user_name,user_phone,user_gender,user_type}")
    private String[] arr;


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        this.baseService = userService;
    }

    /**
     * 条件查询
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，goodsName，goodsPlace
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        UserExample condition = new UserExample();
        UserExample.Criteria criteria = condition.createCriteria();

        //解析json并使用
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //姓名模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andUserNameLike("%" + jsonObject.getString(name) + "%");
        }

        //姓名模糊查询
        if (jsonObject.containsKey(gender)) {
            criteria.andUserGenderEqualTo(jsonObject.getInteger(gender));
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<User> list = baseService.selectByCondition(condition);
        Page<User> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}
