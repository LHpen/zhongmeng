package com.zhongmeng.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhongmeng.pojo.Category;
import com.zhongmeng.pojo.more_type;

import java.util.Date;
import java.util.List;

public class TeachersVo {
    private Integer tid;

    private String tloginname;

    private String code;

    private String tpw;

    private String tname;

    private List<Category> ttype;

    private String type;

    private String tel;

    private String email;

    private String weixin;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;

    private String tsex;

    private String timg;

    private String positional;

    private String datil;

    private Category category;

    private more_type moreType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTloginname() {
        return tloginname;
    }

    public void setTloginname(String tloginname) {
        this.tloginname = tloginname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTpw() {
        return tpw;
    }

    public void setTpw(String tpw) {
        this.tpw = tpw;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Category> getTtype() {
        return ttype;
    }

    public void setTtype(List<Category> ttype) {
        this.ttype = ttype;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg;
    }

    public String getPositional() {
        return positional;
    }

    public void setPositional(String positional) {
        this.positional = positional;
    }

    public String getDatil() {
        return datil;
    }

    public void setDatil(String datil) {
        this.datil = datil;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public more_type getMoreType() {
        return moreType;
    }

    public void setMoreType(more_type moreType) {
        this.moreType = moreType;
    }
}
