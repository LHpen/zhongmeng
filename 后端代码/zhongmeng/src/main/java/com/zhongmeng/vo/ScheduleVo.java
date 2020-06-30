package com.zhongmeng.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhongmeng.pojo.Schedule;

import java.util.Date;
import java.util.List;

public class ScheduleVo {

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date day;

    private List<Schedule> list;

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public List<Schedule> getList() {
        return list;
    }

    public void setList(List<Schedule> list) {
        this.list = list;
    }
}
