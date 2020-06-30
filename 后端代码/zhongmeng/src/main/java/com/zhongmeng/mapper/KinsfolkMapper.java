package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Kinsfolk;
import com.zhongmeng.pojo.KinsfolkExample;
import com.zhongmeng.pojo.KinsfolkVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KinsfolkMapper {
    long countByExample(KinsfolkExample example);

    int deleteByExample(KinsfolkExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(Kinsfolk record);

    int insertSelective(Kinsfolk record);

    List<Kinsfolk> selectByExample(KinsfolkExample example);

    Kinsfolk selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") Kinsfolk record, @Param("example") KinsfolkExample example);

    int updateByExample(@Param("record") Kinsfolk record, @Param("example") KinsfolkExample example);

    int updateByPrimaryKeySelective(Kinsfolk record);

    int updateByPrimaryKey(Kinsfolk record);

    List<KinsfolkVo> getKinsfolkByName(@Param("kname") String kname);
    List<Kinsfolk> findBebeByVid(int vid);
}