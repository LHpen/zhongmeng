package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Class {
    private Integer classid;

    private String classname;

    private String cdatil;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date cstarttime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date cendtime;

    private Integer addressid;

    private Integer courseid;

    private Integer tid;

    private Integer bbmaxnumber;

    private String cstate;

    private String addressName;
    
    //实体类地址对象
    private Address address;

    //实体类课程对象
    private Course course;

    //实体类老师对象
    private Teachers teachers;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getCdatil() {
        return cdatil;
    }

    public void setCdatil(String cdatil) {
        this.cdatil = cdatil == null ? null : cdatil.trim();
    }

    public Date getCstarttime() {
        return cstarttime;
    }

    public void setCstarttime(Date cstarttime) {
        this.cstarttime = cstarttime;
    }

    public Date getCendtime() {
        return cendtime;
    }

    public void setCendtime(Date cendtime) {
        this.cendtime = cendtime;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getBbmaxnumber() {
        return bbmaxnumber;
    }

    public void setBbmaxnumber(Integer bbmaxnumber) {
        this.bbmaxnumber = bbmaxnumber;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate == null ? null : cstate.trim();
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }
}