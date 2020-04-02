package com.sam.controller;

import com.sam.pojo.Receipt;
import com.sam.pojo.ReceiptExample;
import com.sam.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 17:04
 */
@Controller
@RequestMapping("receipt")
public class ReceiptController extends BaseController<Receipt, ReceiptExample> {
    private ReceiptService receiptService;

    @Autowired
    public void setReceiptService(ReceiptService receiptService) {
        this.receiptService = receiptService;
        this.baseService = receiptService;
    }
}
