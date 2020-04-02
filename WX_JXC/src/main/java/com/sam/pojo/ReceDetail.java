package com.sam.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ReceDetail {
    private Integer detaId;

    private Integer detaReceId;

    private Integer detaGoodsId;

    private Integer detaNum;

    private BigDecimal detaPrice;

    private Date detaFresh;

    public Integer getDetaId() {
        return detaId;
    }

    public void setDetaId(Integer detaId) {
        this.detaId = detaId;
    }

    public Integer getDetaReceId() {
        return detaReceId;
    }

    public void setDetaReceId(Integer detaReceId) {
        this.detaReceId = detaReceId;
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

    public Date getDetaFresh() {
        return detaFresh;
    }

    public void setDetaFresh(Date detaFresh) {
        this.detaFresh = detaFresh;
    }
}