package com.zhongmeng.service.impl;

import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.mapper.ScheduleMapper;
import com.zhongmeng.pojo.Schedule;
import com.zhongmeng.pojo.ScheduleExample;
import com.zhongmeng.service.ScheduleService;
import com.zhongmeng.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public ServerResponse findScheuleByRecord(Date day, Integer addressid) {

        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(day);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, 7);  //设置为后7天
        Date laterDate = calendar.getTime();   //得到后7天的时间

        List<ScheduleVo> list = scheduleMapper.selectByDay(day, laterDate, addressid);

        return ServerResponse.createBySuccess(list);
    }
    @Override
    public void insert(Schedule schedule){

    }
}
