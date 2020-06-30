package com.zhongmeng.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Classbebes {
    private Integer cbid;

    private Integer classid;

    private Integer kid;

    private Integer remainhours;

    //实体类课程对象
    private Class aClass;
    //实体类亲属对象
    private Kinsfolk kinsfolk;

    private Teachers teachers;

    private Course course;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Kinsfolk getKinsfolk() {
        return kinsfolk;
    }

    public void setKinsfolk(Kinsfolk kinsfolk) {
        this.kinsfolk = kinsfolk;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getRemainhours() {
        return remainhours;
    }

    public void setRemainhours(Integer remainhours) {
        this.remainhours = remainhours;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}