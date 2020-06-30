package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *订单信息
 */
public class Orders {

    private Integer oid;//主键标识

    private Integer vid;//会员（家长）标识

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date otime;//订单时间

    private String ostarte;//订单状态

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getOstarte() {
        return ostarte;
    }

    public void setOstarte(String ostarte) {
        this.ostarte = ostarte == null ? null : ostarte.trim();
    }
}