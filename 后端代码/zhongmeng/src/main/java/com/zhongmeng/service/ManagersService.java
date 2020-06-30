package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Managers;
import com.zhongmeng.pojo.ManagersExample;

import java.util.List;

public interface ManagersService {

    Managers selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Managers record);

    Managers toLogin(String mloginname, String mpw);

    int deleteByPrimaryKey(Integer mid);

    List<Managers> selectByExample(ManagersExample example);

    int insertSelective(Managers record);

    PageInfo<Managers> findManagersByname(Integer pagNum, Integer pageSize, String mname);

}
