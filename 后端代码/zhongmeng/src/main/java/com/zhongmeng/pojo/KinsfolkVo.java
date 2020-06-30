package com.zhongmeng.pojo;

import java.util.Date;

public class KinsfolkVo {
    private Integer kid;

    private String kname;

    private Date birthday;

    private String ksex;

    private String ktype;

    private Vip vip;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getKsex() {
        return ksex;
    }

    public void setKsex(String ksex) {
        this.ksex = ksex == null ? null : ksex.trim();
    }

    public String getKtype() {
        return ktype;
    }

    public void setKtype(String ktype) {
        this.ktype = ktype == null ? null : ktype.trim();
    }

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }
}
