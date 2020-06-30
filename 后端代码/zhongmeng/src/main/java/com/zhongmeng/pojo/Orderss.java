package com.zhongmeng.pojo;

import java.math.BigDecimal;

/**
 *订到详细信息
 */
public class Orderss {

    private Integer odid;//主键标识

    private Integer oid;//订单标识

    private Integer gid;//商品标识

    private Integer gnumber;//商品数量

    private BigDecimal gprice;//商品价格

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getGnumber() {
        return gnumber;
    }

    public void setGnumber(Integer gnumber) {
        this.gnumber = gnumber;
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }
}