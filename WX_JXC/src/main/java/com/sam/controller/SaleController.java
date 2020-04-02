package com.sam.controller;

import com.sam.pojo.Sale;
import com.sam.pojo.SaleExample;
import com.sam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 17:07
 */
@Controller
@RequestMapping("sale")
public class SaleController extends BaseController<Sale, SaleExample> {
    private SaleService saleService;

    @Autowired
    public void setSaleService(SaleService saleService) {
        this.saleService = saleService;
        this.baseService = saleService;
    }
}
