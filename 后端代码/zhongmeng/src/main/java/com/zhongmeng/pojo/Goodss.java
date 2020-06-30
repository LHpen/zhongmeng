package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 *商品信息
 */
public class Goodss {

    private Integer gid;//主键

    private String gname;//商品名称

    private BigDecimal gprice1;//商品原价

    private BigDecimal gprice2;//商品售价

    private BigDecimal gprice3;//商品现价

    private BigDecimal gprice4;//商品折扣

    private String gdatil;//商品简介

    private String gtype;//商品类别

    private String gspec;//商品规格

    private Integer gnumber;//商品库存数量

    private String gimg;//商品图片

    private Integer gsnumber;//商品销量

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gtime;//商品上架时间

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public BigDecimal getGprice1() {
        return gprice1;
    }

    public void setGprice1(BigDecimal gprice1) {
        this.gprice1 = gprice1;
    }

    public BigDecimal getGprice2() {
        return gprice2;
    }

    public void setGprice2(BigDecimal gprice2) {
        this.gprice2 = gprice2;
    }

    public BigDecimal getGprice3() {
        return gprice3;
    }

    public void setGprice3(BigDecimal gprice3) {
        this.gprice3 = gprice3;
    }

    public BigDecimal getGprice4() {
        return gprice4;
    }

    public void setGprice4(BigDecimal gprice4) {
        this.gprice4 = gprice4;
    }

    public String getGdatil() {
        return gdatil;
    }

    public void setGdatil(String gdatil) {
        this.gdatil = gdatil == null ? null : gdatil.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public String getGspec() {
        return gspec;
    }

    public void setGspec(String gspec) {
        this.gspec = gspec == null ? null : gspec.trim();
    }

    public Integer getGnumber() {
        return gnumber;
    }

    public void setGnumber(Integer gnumber) {
        this.gnumber = gnumber;
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg == null ? null : gimg.trim();
    }

    public Integer getGsnumber() {
        return gsnumber;
    }

    public void setGsnumber(Integer gsnumber) {
        this.gsnumber = gsnumber;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }
}