package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Teachers;
import com.zhongmeng.pojo.TeachersExample;
import com.zhongmeng.vo.TeachersVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersMapper {
    long countByExample(TeachersExample example);

    int deleteByExample(TeachersExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Teachers record);

    int insertSelective(Teachers record);

    List<Teachers> selectByExample(TeachersExample example);

    Teachers selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Teachers record, @Param("example") TeachersExample example);

    int updateByExample(@Param("record") Teachers record, @Param("example") TeachersExample example);

    int updateByPrimaryKeySelective(Teachers record);

    int updateByPrimaryKey(Teachers record);

    List<Teachers> selectALL();

    List<TeachersVo> select(@Param("tname") String tname);

    TeachersVo selectByid(@Param("tid") int tid);

    int selectDescLimt();

//    List<Category> selectByTypes();

    List<TeachersVo> selectByTname(@Param("tname") String tname);
}