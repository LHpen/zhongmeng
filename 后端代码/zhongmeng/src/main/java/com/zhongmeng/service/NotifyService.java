package com.zhongmeng.service;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Notify;

public interface NotifyService {
    int insert(String ntheme,String ncontent,String ntype,String nstate,String nimg);
    Notify findNotifyById(Integer id);
    int selectMAXID();
    void deleteByKey(Integer nid);

    PageInfo<Notify> selectByExample(Integer pageNum, Integer pageSize, String ntheme);
    Notify selectALLMessage(int nid);
    PageInfo<Notify> selectALL(Integer pageNum,Integer pageSize);


    void updateNotifyById( Notify notify);
}
