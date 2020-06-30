package com.zhongmeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.KinsfolkMapper;
import com.zhongmeng.pojo.Kinsfolk;
import com.zhongmeng.pojo.KinsfolkVo;
import com.zhongmeng.service.KinsfolkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KinsfolkServiceImpl implements KinsfolkService {

    @Autowired
    private KinsfolkMapper kinsfolkMapper;


    @Override
    public PageInfo<KinsfolkVo> selectByExample(Integer pagNum, Integer pageSize, String kname) {
        PageHelper.startPage(pagNum,pageSize);
        List<KinsfolkVo> list = kinsfolkMapper.getKinsfolkByName(kname);

        return new PageInfo<>(list) ;
    }

    @Override
    public int insert(Kinsfolk record) {
        return kinsfolkMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer kid) {
        return kinsfolkMapper.deleteByPrimaryKey(kid);
    }

    @Override
    public int updateByPrimaryKey(Kinsfolk record) {
        return kinsfolkMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public Kinsfolk findBebeByid(Integer kid) {
        return kinsfolkMapper.selectByPrimaryKey(kid);
    }

    @Override
    public List<Kinsfolk> findBebeList() {
        return kinsfolkMapper.selectByExample(null);
    }

    @Override
    public List<Kinsfolk> findBebeByVid(int vid) {
        return kinsfolkMapper.findBebeByVid(vid);
    }


}
