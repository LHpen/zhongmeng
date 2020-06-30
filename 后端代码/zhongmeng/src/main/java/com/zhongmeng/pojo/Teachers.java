package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Teachers {
    private Integer tid;

    private String tloginname;

    private String code;

    private String tpw;

    private String tname;

    private Integer ttype;

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

    public more_type getMoreType() {
        return moreType;
    }

    public void setMoreType(more_type moreType) {
        this.moreType = moreType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
        this.tloginname = tloginname == null ? null : tloginname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTpw() {
        return tpw;
    }

    public void setTpw(String tpw) {
        this.tpw = tpw == null ? null : tpw.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTtype() {
        return ttype;
    }

    public void setTtype(Integer ttype) {
        this.ttype = ttype;
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

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg == null ? null : timg.trim();
    }

    public String getPositional() {
        return positional;
    }

    public void setPositional(String positional) {
        this.positional = positional == null ? null : positional.trim();
    }

    public String getDatil() {
        return datil;
    }

    public void setDatil(String datil) {
        this.datil = datil == null ? null : datil.trim();
    }
}