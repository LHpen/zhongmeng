package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Schedule;
import com.zhongmeng.pojo.ScheduleExample;

import java.util.Date;
import java.util.List;

import com.zhongmeng.vo.ScheduleVo;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    int countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleid);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer scheduleid);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);

    List<ScheduleVo> selectByDay(@Param("day") Date day, @Param("laterDate") Date laterDate,@Param("addressid") Integer addressid);
}