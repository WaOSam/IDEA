package com.sam.pojo;

import java.math.BigDecimal;

public class SaleDetail {
    private Integer detaId;

    private Integer detaSaleId;

    private Integer detaGoodsId;

    private Integer detaNum;

    private BigDecimal detaPrice;

    public Integer getDetaId() {
        return detaId;
    }

    public void setDetaId(Integer detaId) {
        this.detaId = detaId;
    }

    public Integer getDetaSaleId() {
        return detaSaleId;
    }

    public void setDetaSaleId(Integer detaSaleId) {
        this.detaSaleId = detaSaleId;
    }

    public Integer getDetaGoodsId() {
        return detaGoodsId;
    }

    public void setDetaGoodsId(Integer detaGoodsId) {
        this.detaGoodsId = detaGoodsId;
    }

    public Integer getDetaNum() {
        return detaNum;
    }

    public void setDetaNum(Integer detaNum) {
        this.detaNum = detaNum;
    }

    public BigDecimal getDetaPrice() {
        return detaPrice;
    }

    public void setDetaPrice(BigDecimal detaPrice) {
        this.detaPrice = detaPrice;
    }
}