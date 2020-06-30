package com.zhongmeng.service;

import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Address;

public interface AddressService {

    /**
     * 查询分页
     * @param pagNum
     * @param pageSize
     * @param address
     * @return
     */
    ServerResponse findAddressByName(Integer pagNum, Integer pageSize, String address);

    /**
     * 添加地址
     * @param address
     * @return
     */
    ServerResponse add(Address address);

    /**
     * 删除
     * @param addressid
     * @return
     */
    ServerResponse delete(Integer addressid);

    /**
     * 加载单个地址数据
     * @param addressid
     * @return
     */
    ServerResponse<Address> load(Integer addressid);

    /**
     * 加载未使用的课室
     * @return
     */
    ServerResponse list();

    /**
     * 修改单个地址
     * @param address
     * @return
     */
    ServerResponse update(Address address);


}
