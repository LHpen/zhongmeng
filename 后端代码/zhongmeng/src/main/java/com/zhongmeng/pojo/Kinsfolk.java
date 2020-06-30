package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Kinsfolk {
    private Integer kid;

    private String kname;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;

    private String ksex;

    private String ktype;

    private Integer vid;

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

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Kinsfolk{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                ", birthday=" + birthday +
                ", ksex='" + ksex + '\'' +
                ", ktype='" + ktype + '\'' +
                ", vid=" + vid +
                ", vip=" + vip +
                '}';
    }
}