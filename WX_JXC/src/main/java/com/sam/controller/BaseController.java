package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.sam.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 12:55
 */
public class BaseController<E,T> {
    protected BaseService<E,T> baseService;

    E t;

    @RequestMapping("list")
    @ResponseBody
    public String list(){
        return JSON.toJSONString(baseService.list());
    }

    @RequestMapping("find")
    @ResponseBody
    public String selectById(@RequestParam("id") Integer id){
        return JSON.toJSONString(baseService.selectById(id));
    }
}
