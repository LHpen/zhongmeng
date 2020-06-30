package com.zhongmeng.controller;

import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Schedule;
import com.zhongmeng.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping("query")
    public ServerResponse query(Date day,Integer addressid){
        return scheduleService.findScheuleByRecord(day,addressid);
    }
    @RequestMapping("insert")
    public void insert(Schedule schedule){
         scheduleService.insert(schedule);
    }
}
