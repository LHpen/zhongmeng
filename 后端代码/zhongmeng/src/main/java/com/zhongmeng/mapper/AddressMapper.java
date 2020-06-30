package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Address;
import com.zhongmeng.pojo.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Integer addressid);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    /**
     * 根据使用状态查询地址列表
     * @param status
     * @return
     */
    List<Address> selectAllByStatus(Integer status);

    /**
     * 修改使用期到的课室状态
     * @param record
     * @param ids
     * @return
     */
    int updateStatusByIds(@Param("record") Address record, @Param("ids") List<Integer> ids);
}