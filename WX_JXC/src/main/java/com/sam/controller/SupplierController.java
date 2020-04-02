package com.sam.controller;

import com.sam.pojo.Supplier;
import com.sam.pojo.SupplierExample;
import com.sam.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 17:08
 */
@Controller
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier, SupplierExample> {
    private SupplierService supplierService;

    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
        this.baseService = supplierService;
    }
}
