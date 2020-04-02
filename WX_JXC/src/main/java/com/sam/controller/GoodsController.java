package com.sam.controller;

import com.sam.pojo.Goods;
import com.sam.pojo.GoodsExample;
import com.sam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 15:59
 */
@Controller
@RequestMapping("goods")
public class GoodsController extends BaseController<Goods, GoodsExample> {
    private GoodsService goodsService;

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
        this.baseService = goodsService;
    }
}
