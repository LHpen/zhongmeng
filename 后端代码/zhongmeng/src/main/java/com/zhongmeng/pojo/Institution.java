package com.zhongmeng.pojo;

/**
 *机构信息
 */
public class Institution {
    private Integer insid;  //主键

    private String insname; //公司名称

    private String insdatil; //公司简介

    private String weixin2dcode; //公众号二维码

    private String logo; //logo

    private String tel; //电话

    private String email; //邮箱

    private String address; //地址

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public String getInsname() {
        return insname;
    }

    public void setInsname(String insname) {
        this.insname = insname == null ? null : insname.trim();
    }

    public String getInsdatil() {
        return insdatil;
    }

    public void setInsdatil(String insdatil) {
        this.insdatil = insdatil == null ? null : insdatil.trim();
    }

    public String getWeixin2dcode() {
        return weixin2dcode;
    }

    public void setWeixin2dcode(String weixin2dcode) {
        this.weixin2dcode = weixin2dcode == null ? null : weixin2dcode.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}