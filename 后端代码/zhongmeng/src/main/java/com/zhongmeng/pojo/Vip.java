package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vip {
    private Integer vid;

    private String vloginname;

    private String code;

    private String vpw;

    private String vname;

    private String viptype;

    private String tel;

    private String email;

    private String weixin;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;

    private String vsex;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date vaddtime;

    private String vaddress;

    private String vstate;

    private String openid;

    private String headimgurl;

    private String nickname;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVloginname() {
        return vloginname;
    }

    public void setVloginname(String vloginname) {
        this.vloginname = vloginname == null ? null : vloginname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getVpw() {
        return vpw;
    }

    public void setVpw(String vpw) {
        this.vpw = vpw == null ? null : vpw.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getViptype() {
        return viptype;
    }

    public void setViptype(String viptype) {
        this.viptype = viptype == null ? null : viptype.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getVsex() {
        return vsex;
    }

    public void setVsex(String vsex) {
        this.vsex = vsex == null ? null : vsex.trim();
    }

    public Date getVaddtime() {
        return vaddtime;
    }

    public void setVaddtime(Date vaddtime) {
        this.vaddtime = vaddtime;
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress == null ? null : vaddress.trim();
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate == null ? null : vstate.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}