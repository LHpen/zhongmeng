package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Goodss;
import com.zhongmeng.pojo.GoodssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品信息表持久层接口
 */
public interface GoodssMapper {
    int countByExample(GoodssExample example);

    int deleteByExample(GoodssExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goodss record);

    int insertSelective(Goodss record);

    List<Goodss> selectByExample(GoodssExample example);

    Goodss selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Goodss record, @Param("example") GoodssExample example);

    int updateByExample(@Param("record") Goodss record, @Param("example") GoodssExample example);

    int updateByPrimaryKeySelective(Goodss record);

    int updateByPrimaryKey(Goodss record);
}