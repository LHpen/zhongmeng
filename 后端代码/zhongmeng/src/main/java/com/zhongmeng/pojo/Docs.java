package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *机构信息
 */
public class Docs {

    private Integer did; //主键

    private String dtitle; //文章标题

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dtime; //发表时间

    private String dimg; //图片

    private String dinfo; //文章简介

    private String ddatil; //详细

    private String dtype; //文章类别

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle == null ? null : dtitle.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getDimg() {
        return dimg;
    }

    public void setDimg(String dimg) {
        this.dimg = dimg == null ? null : dimg.trim();
    }

    public String getDinfo() {
        return dinfo;
    }

    public void setDinfo(String dinfo) {
        this.dinfo = dinfo == null ? null : dinfo.trim();
    }

    public String getDdatil() {
        return ddatil;
    }

    public void setDdatil(String ddatil) {
        this.ddatil = ddatil == null ? null : ddatil.trim();
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype == null ? null : dtype.trim();
    }
}