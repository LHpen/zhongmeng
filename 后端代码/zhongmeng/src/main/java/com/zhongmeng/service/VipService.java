package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Vip;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VipService {

    int insert(Vip record);

    int deleteByPrimaryKey(Integer vid);

    int updateByPrimaryKey(Vip record);

    PageInfo<Vip> selectByExample(Integer pagNum, Integer pageSize, String vname);

    Vip findVipById(Integer vid);

    int insertWeixin(@Param("openid") String openid, @Param("nickname") String nickname, @Param("headimgurl") String headimgurl);

    Vip selectAll(String openid);

    Integer selectId(String openid);

    String Sex(int sex1);

    int update(String openid, String nickname, String headimgurl);

    Vip seletOpenID();

    List<Vip> selectID();

    String selectVname(int vid);

    Vip findVipByOpenid(String openid);

    List<Vip> findAll();

}
