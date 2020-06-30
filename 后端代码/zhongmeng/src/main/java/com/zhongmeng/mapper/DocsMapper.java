package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Docs;
import com.zhongmeng.pojo.DocsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *文章信息表持久层接口
 */
public interface DocsMapper {
    int countByExample(DocsExample example);

    int deleteByExample(DocsExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Docs record);

    int insertSelective(Docs record);

    List<Docs> selectByExample(DocsExample example);

    Docs selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Docs record, @Param("example") DocsExample example);

    int updateByExample(@Param("record") Docs record, @Param("example") DocsExample example);

    int updateByPrimaryKeySelective(Docs record);

    int updateByPrimaryKey(Docs record);
}