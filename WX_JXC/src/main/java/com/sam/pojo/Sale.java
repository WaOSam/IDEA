package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {
    private Integer saleId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date saleCreatetime;

    private Integer saleCustId;

    private Integer saleUserId;

    private BigDecimal saleSum;

    private Integer saleState;

    private String saleNote;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Date getSaleCreatetime() {
        return saleCreatetime;
    }

    public void setSaleCreatetime(Date saleCreatetime) {
        this.saleCreatetime = saleCreatetime;
    }

    public Integer getSaleCustId() {
        return saleCustId;
    }

    public void setSaleCustId(Integer saleCustId) {
        this.saleCustId = saleCustId;
    }

    public Integer getSaleUserId() {
        return saleUserId;
    }

    public void setSaleUserId(Integer saleUserId) {
        this.saleUserId = saleUserId;
    }

    public BigDecimal getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(BigDecimal saleSum) {
        this.saleSum = saleSum;
    }

    public Integer getSaleState() {
        return saleState;
    }

    public void setSaleState(Integer saleState) {
        this.saleState = saleState;
    }

    public String getSaleNote() {
        return saleNote;
    }

    public void setSaleNote(String saleNote) {
        this.saleNote = saleNote == null ? null : saleNote.trim();
    }
}