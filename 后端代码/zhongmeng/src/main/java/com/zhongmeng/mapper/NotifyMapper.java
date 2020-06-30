package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Notify;
import com.zhongmeng.pojo.NotifyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NotifyMapper {
    int countByExample(NotifyExample example);

    int deleteByExample(NotifyExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Notify record);

    int insertSelective(Notify record);

    List<Notify> selectByExample(NotifyExample example);

    Notify selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Notify record, @Param("example") NotifyExample example);

    int updateByExample(@Param("record") Notify record, @Param("example") NotifyExample example);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKey(Notify record);

//    Notify selectByExample(String ntheme);

    int selectMAXID();

    Notify selectALLMessage(@Param("nid") int nid);

    List<Notify> selectALL();

    Notify selectNstate(int nid);
}