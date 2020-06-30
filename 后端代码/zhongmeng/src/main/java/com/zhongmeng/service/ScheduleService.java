package com.zhongmeng.service;

import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Schedule;

import java.util.Date;

public interface ScheduleService {

    ServerResponse findScheuleByRecord(Date day,Integer addressid);

    void insert(Schedule schedule);
}
