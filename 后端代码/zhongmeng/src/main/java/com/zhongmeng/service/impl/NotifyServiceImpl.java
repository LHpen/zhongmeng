package com.zhongmeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.MessageMapper;
import com.zhongmeng.mapper.NotifyMapper;
import com.zhongmeng.pojo.MessageExample;
import com.zhongmeng.pojo.Notify;
import com.zhongmeng.pojo.NotifyExample;
import com.zhongmeng.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyMapper mapper;

    @Autowired
    private MessageMapper messageMapper;

    /**
     * 插入内容
     * **/
    @Override
    public int insert(String ntheme,  String ncontent, String ntype,  String nstate,String nimg) {
        Notify notify = new Notify();
        notify.setNtheme(ntheme);
        notify.setNcontent(ncontent);
        notify.setNtype(ntype);
        notify.setNstate(nstate);
        notify.setNimg(nimg);
        Date createtime =new Date();
        notify.setCreatetime(createtime);
        return mapper.insert(notify);
    }

    /**
     * 查询单个信息
     * **/
    @Override
    public Notify findNotifyById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 获得刚插入数据库表的某条数据的主键
     * **/
    @Override
    public int selectMAXID() {
        int msg=mapper.selectMAXID();
        return msg;
    }

    @Override
    public void deleteByKey(Integer nid) {
        MessageExample example = new MessageExample();
        MessageExample.Criteria criteria = example.createCriteria();
        criteria.andNidEqualTo(nid);

        messageMapper.deleteByExample(example);

        mapper.deleteByPrimaryKey(nid);
    }

    @Override
    public PageInfo<Notify> selectByExample(Integer pageNum,Integer pageSize,String ntheme) {
        PageHelper.startPage(pageNum,pageSize);
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNthemeLike("%"+ntheme+"%");
        List<Notify> list = mapper.selectByExample(example);

        PageInfo<Notify> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Notify selectALLMessage(int nid) {
        return mapper.selectALLMessage(nid);
    }


    @Override
    public PageInfo<Notify> selectALL(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Notify> list = mapper.selectALL();
        PageInfo<Notify> pageInfo = new PageInfo<>(list);
    return pageInfo;
    }

    @Override
    public  void updateNotifyById(Notify notify) {
        Date updatetime = new Date();
        notify.setUpdatetime(updatetime);
       mapper.updateByPrimaryKeySelective(notify);
    }

}
