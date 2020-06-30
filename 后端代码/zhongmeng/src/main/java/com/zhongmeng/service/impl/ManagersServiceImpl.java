package com.zhongmeng.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.ManagersMapper;
import com.zhongmeng.pojo.Managers;
import com.zhongmeng.pojo.ManagersExample;
import com.zhongmeng.service.ManagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagersServiceImpl implements ManagersService {
    @Autowired
    private ManagersMapper managersMapper;

    @Override
    public Managers selectByPrimaryKey(Integer mid) {
        return managersMapper.selectByPrimaryKey(mid);
    }

    @Override
    public int updateByPrimaryKeySelective(Managers record) {
        return managersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Managers toLogin(String mloginname, String mpw) {

        return managersMapper.toLogin(mloginname,mpw);
    }

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return managersMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public List<Managers> selectByExample(ManagersExample example) {

        return managersMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(Managers record) {
        return managersMapper.insertSelective(record);
    }

    @Override
    public PageInfo<Managers> findManagersByname(Integer pagNum, Integer pageSize, String mname) {
        PageHelper.startPage(pagNum,pageSize);
        ManagersExample example = new ManagersExample();
        ManagersExample.Criteria criteria = example.createCriteria();
        criteria.andMnameLike("%" + mname + "%");

        List<Managers> list = managersMapper.selectByExample(example);
        return new PageInfo<>(list);
    }



}
