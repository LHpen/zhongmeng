package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Institution;
import com.zhongmeng.pojo.InstitutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 机构信息表持久层接口
 */
public interface InstitutionMapper {
    int countByExample(InstitutionExample example);

    int deleteByExample(InstitutionExample example);

    int deleteByPrimaryKey(Integer insid);

    int insert(Institution record);

    int insertSelective(Institution record);

    List<Institution> selectByExample(InstitutionExample example);

    Institution selectByPrimaryKey(Integer insid);

    int updateByExampleSelective(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByExample(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);
}