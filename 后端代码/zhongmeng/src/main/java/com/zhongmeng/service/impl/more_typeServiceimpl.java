package com.zhongmeng.service.impl;

import com.zhongmeng.mapper.more_typeMapper;
import com.zhongmeng.pojo.more_type;
import com.zhongmeng.service.more_typeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class more_typeServiceimpl implements more_typeService {

    @Autowired
    private more_typeMapper moreTypeMapper;

    @Override
    public int insert(more_type moreType) {
        return moreTypeMapper.insert(moreType);
    }

    @Override
    public int delete(int T_id) {
        return moreTypeMapper.delete(T_id);
    }
}
