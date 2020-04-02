package com.sam.controller;

import com.sam.pojo.ReceDetail;
import com.sam.pojo.ReceDetailExample;
import com.sam.service.ReceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 16:34
 */
@Controller
@RequestMapping("receDetail")
public class ReceDetailController extends BaseController<ReceDetail, ReceDetailExample> {
    private ReceDetailService receDetailService;

    @Autowired
    public void setReceDetailService(ReceDetailService receDetailService) {
        this.receDetailService = receDetailService;
        this.baseService = receDetailService;
    }
}
