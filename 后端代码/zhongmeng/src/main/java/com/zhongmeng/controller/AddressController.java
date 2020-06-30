package com.zhongmeng.controller;

import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Address;
import com.zhongmeng.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    //分页查询
    @RequestMapping("query")
    public ServerResponse query(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "address", defaultValue = "") String address){
        return addressService.findAddressByName(pageNum,pageSize,address);
    }
    //添加
    @RequestMapping("add")
    public ServerResponse add(Address address){
        return addressService.add(address);
    }
    //加载单个地址
    @RequestMapping("load")
    public ServerResponse<Address> load(Integer addressid){
        return addressService.load(addressid);
    }
    //删除单个
    @RequestMapping("delete")
    public ServerResponse delete(Integer addressid){
        return addressService.delete(addressid);
    }
    //加载地址数据列表
    @RequestMapping("list")
    public ServerResponse list(){
        return addressService.list();
    }
    //修改信息
    @RequestMapping("update")
    public ServerResponse update(Address address){
        System.out.println(address);
        return addressService.update(address);
    }
}
