package com.zhongmeng.pojo;


/**
 *管理员
 */
public class Managers {

    private Integer mid;   //主键

    private String mloginname; //登录名

    private String mpw; //密码

    private String mname; //姓名

    private String managetype; //登录类别

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMloginname() {
        return mloginname;
    }

    public void setMloginname(String mloginname) {
        this.mloginname = mloginname == null ? null : mloginname.trim();
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw == null ? null : mpw.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getManagetype() {
        return managetype;
    }

    public void setManagetype(String managetype) {
        this.managetype = managetype == null ? null : managetype.trim();
    }

    @Override
    public String toString() {
        return "Managers{" +
                "mid=" + mid +
                ", mloginname='" + mloginname + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mname='" + mname + '\'' +
                ", managetype='" + managetype + '\'' +
                '}';
    }
}