package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Managers;
import com.zhongmeng.pojo.ManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表持久层接口
 */
public interface ManagersMapper {

    Managers toLogin(@Param("mloginname") String mloginname, @Param("mpw") String mpw);

    int countByExample(ManagersExample example);

    int deleteByExample(ManagersExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Managers record);

    int insertSelective(Managers record);

    List<Managers> selectByExample(ManagersExample example);

    Managers selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByExample(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByPrimaryKeySelective(Managers record);

    int updateByPrimaryKey(Managers record);
}