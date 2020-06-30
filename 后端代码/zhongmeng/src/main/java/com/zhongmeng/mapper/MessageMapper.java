package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Message;
import com.zhongmeng.pojo.MessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> selectAll();

    int Read(int vid);

    List<Message> selectID();

    int changRead(@Param("vid") int vid,@Param("nid") int nid);
    int deleteinvalid(@Param("vid") int vid,@Param("nid") int nid);
}