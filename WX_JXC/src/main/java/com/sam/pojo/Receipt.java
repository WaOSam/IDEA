package com.sam.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt {
    private Integer receId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date receCreatetime;

    private Integer receSuppId;

    private Integer receUserId;

    private BigDecimal receSum;

    private Integer receSate;

    private String receNote;

    public Integer getReceId() {
        return receId;
    }

    public void setReceId(Integer receId) {
        this.receId = receId;
    }

    public Date getReceCreatetime() {
        return receCreatetime;
    }

    public void setReceCreatetime(Date receCreatetime) {
        this.receCreatetime = receCreatetime;
    }

    public Integer getReceSuppId() {
        return receSuppId;
    }

    public void setReceSuppId(Integer receSuppId) {
        this.receSuppId = receSuppId;
    }

    public Integer getReceUserId() {
        return receUserId;
    }

    public void setReceUserId(Integer receUserId) {
        this.receUserId = receUserId;
    }

    public BigDecimal getReceSum() {
        return receSum;
    }

    public void setReceSum(BigDecimal receSum) {
        this.receSum = receSum;
    }

    public Integer getReceSate() {
        return receSate;
    }

    public void setReceSate(Integer receSate) {
        this.receSate = receSate;
    }

    public String getReceNote() {
        return receNote;
    }

    public void setReceNote(String receNote) {
        this.receNote = receNote == null ? null : receNote.trim();
    }
}