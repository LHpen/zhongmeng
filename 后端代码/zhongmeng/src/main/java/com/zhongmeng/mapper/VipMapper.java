package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Vip;
import com.zhongmeng.pojo.VipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VipMapper {
    int countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    int insertWeixin(@Param("openid") String openid, @Param("nickname") String nickname, @Param("headimgurl") String headimgurl);
    Vip selectAll(String openid);
    int selectId(String openid);


    int update(@Param("openid") String openid, @Param("nickname") String nickname, @Param("headimgurl") String headimgurl);
    Vip selectOpenID();

    List<Vip> selectID();

    String selectVname(int vid);

    Vip findVipByOpenid(@Param("openid")String openid);

    List<Vip> selectAllList();
}