package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Orderss;
import com.zhongmeng.pojo.OrderssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单详细信息表持久层接口
 */
public interface OrderssMapper {
    int countByExample(OrderssExample example);

    int deleteByExample(OrderssExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Orderss record);

    int insertSelective(Orderss record);

    List<Orderss> selectByExample(OrderssExample example);

    Orderss selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") Orderss record, @Param("example") OrderssExample example);

    int updateByExample(@Param("record") Orderss record, @Param("example") OrderssExample example);

    int updateByPrimaryKeySelective(Orderss record);

    int updateByPrimaryKey(Orderss record);
}