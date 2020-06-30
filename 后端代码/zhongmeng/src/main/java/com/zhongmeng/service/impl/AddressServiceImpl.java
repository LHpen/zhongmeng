package com.zhongmeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.mapper.AddressMapper;
import com.zhongmeng.pojo.Address;
import com.zhongmeng.pojo.AddressExample;

import com.zhongmeng.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public ServerResponse findAddressByName(Integer pagNum, Integer pageSize,String address){
        PageHelper.startPage(pagNum,pageSize);

        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andAddressLike("%" + address + "%");

        List<Address> list = addressMapper.selectByExample(example);

        return ServerResponse.createBySuccess(new PageInfo<>(list));
    }

    @Override
    public ServerResponse add(Address address){
        //更新时间
        address.setUpdatetime(new Date());
        addressMapper.insertSelective(address);
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    @Override
    public ServerResponse delete(Integer addressid) {
        try {
            addressMapper.deleteByPrimaryKey(addressid);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.createByErrorMessage("删除失败！请先删除选择该地址的班级");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    @Override
    public ServerResponse<Address> load(Integer addressid) {
        Address address = addressMapper.selectByPrimaryKey(addressid);
        return ServerResponse.createBySuccess(address);
    }

    @Override
    public ServerResponse list() {
        //查询状态为0的课室
        List<Address> list = addressMapper.selectAllByStatus(0);
        return  ServerResponse.createBySuccess(list);
    }

    @Override
    public ServerResponse update(Address address) {
        address.setUpdatetime(new Date());
        addressMapper.updateByPrimaryKeySelective(address);
        return ServerResponse.createBySuccessMessage("修改成功");
    }


}
