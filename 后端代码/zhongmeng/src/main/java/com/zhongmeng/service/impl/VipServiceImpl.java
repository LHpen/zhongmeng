package com.zhongmeng.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.VipMapper;
import com.zhongmeng.pojo.Vip;
import com.zhongmeng.pojo.VipExample;
import com.zhongmeng.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class VipServiceImpl implements VipService {


    @Autowired
    private VipMapper vipMapper;


    @Override
    public int insert(Vip record) {
        record.setVaddtime(new Date());
        return vipMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer vid) {
        return vipMapper.deleteByPrimaryKey(vid);
    }

    @Override
    public int updateByPrimaryKey(Vip record) {
        return vipMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public PageInfo<Vip> selectByExample(Integer pageNum, Integer pageSize, String vname) {

        PageHelper.startPage(pageNum,pageSize);
        VipExample example = new VipExample();
        VipExample.Criteria criteria = example.createCriteria();
        criteria.andVnameLike("%"+ vname + "%");
        List<Vip> list = vipMapper.selectByExample(example);
        
        PageInfo<Vip> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Vip findVipById(Integer vid) {
        return vipMapper.selectByPrimaryKey(vid);
    }

    @Override
    public int insertWeixin(String openid, String nickname, String headimgurl) {
        return vipMapper.insertWeixin(openid,nickname,headimgurl);
    }

    @Override
    public Vip selectAll(String openid) {
        Vip vip = vipMapper.selectAll(openid);
        return vip;
    }

    @Override
    public Integer selectId(String openid) {
        return vipMapper.selectId(openid);
    }

    @Override
    public String Sex(int sex1) {
        String sex="女";
        if(sex1==1){
            sex="男";
        }
        return sex;
    }

    @Override
    public int update(String openid,String nickname,String headimgurl) {
        return vipMapper.update(openid, nickname, headimgurl);
    }

    @Override
    public Vip seletOpenID() {
        Vip vip = vipMapper.selectOpenID();
        return vip;
    }

    @Override
    public List<Vip> selectID() {
        return vipMapper.selectID();
    }

    @Override
    public String selectVname(int vid) {
        return vipMapper.selectVname(vid);
    }

    @Override
    public Vip findVipByOpenid(String openid){
        return vipMapper.findVipByOpenid(openid);
    }

    @Override
    public List<Vip> findAll() {
        return vipMapper.selectAllList();
    }


}
