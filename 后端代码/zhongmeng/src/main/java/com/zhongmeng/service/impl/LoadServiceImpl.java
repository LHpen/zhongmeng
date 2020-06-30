package com.zhongmeng.service.impl;

import com.zhongmeng.mapper.ClassbebesMapper;
import com.zhongmeng.mapper.KinsfolkMapper;
import com.zhongmeng.mapper.VipMapper;
import com.zhongmeng.pojo.Kinsfolk;
import com.zhongmeng.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    VipMapper vipMapper;

    @Autowired
    KinsfolkMapper kinsfolkMapper;

    @Autowired
    ClassbebesMapper classbebesMapper;

    @Override
    public Map<String, Object> LoadIndex() {
        int vip = vipMapper.countByExample(null);

        long kins = kinsfolkMapper.countByExample(null);

        long classbebes = classbebesMapper.countByExample(null);

        Map<String,Object> map=new HashMap<>();

        map.put("vip",vip);
        map.put("kins",kins);
        map.put("classbebes",classbebes);

        return map;
    }
}
