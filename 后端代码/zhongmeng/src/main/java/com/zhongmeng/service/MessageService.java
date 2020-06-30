package com.zhongmeng.service;

import com.zhongmeng.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    int insert(@Param("Nid") int Nid, @Param("Mstate") String Mstate);
    List<Message> selectAll();
    int Read(int vid);
    int changRead(@Param("vid") int vid,@Param("nid") int nid);
    int deleteinvalid(@Param("vid") int vid,@Param("nid") int nid);
}
