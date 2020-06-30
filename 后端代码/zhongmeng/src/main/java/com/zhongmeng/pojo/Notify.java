package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Notify {
    private Integer nid;

    private String ntheme;

    private String ncontent;

    private String ntype;

    private String nimg;

    private String nstate;

    private Integer nzid;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updatetime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtheme() {
        return ntheme;
    }

    public void setNtheme(String ntheme) {
        this.ntheme = ntheme == null ? null : ntheme.trim();
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }

    public String getNtype() {
        return ntype;
    }

    public void setNtype(String ntype) {
        this.ntype = ntype == null ? null : ntype.trim();
    }

    public String getNimg() {
        return nimg;
    }

    public void setNimg(String nimg) {
        this.nimg = nimg == null ? null : nimg.trim();
    }

    public String getNstate() {
        return nstate;
    }

    public void setNstate(String nstate) {
        this.nstate = nstate == null ? null : nstate.trim();
    }

    public Integer getNzid() {
        return nzid;
    }

    public void setNzid(Integer nzid) {
        this.nzid = nzid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}