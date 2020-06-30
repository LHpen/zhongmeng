package com.zhongmeng.service.impl;

import com.zhongmeng.mapper.MessageMapper;
import com.zhongmeng.mapper.VipMapper;
import com.zhongmeng.pojo.Message;
import com.zhongmeng.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private VipMapper vipMapper;


    @Override
    public int insert(int nid,String mstate) {
        int msg = 0;
        List list = vipMapper.selectID();


        for(int m = 0;m<list.size();m++) {
            int i = (int) list.get(m);
            if (i != 0) {
                Message message = new Message();
                message.setMstate(mstate);
                message.setNid(nid);
                message.setVid(i);
                messageMapper.insert(message);
                msg=1;
            }else{
                msg=0;
            }
        }
        return msg;
    }

    @Override
    public List<Message> selectAll() {

        return messageMapper.selectAll();
    }

    @Override
    public int Read(int vid) {
        return messageMapper.Read(vid);
    }

    @Override
    public int changRead(int vid, int nid) {
        return messageMapper.changRead(vid,nid);
    }

    @Override
    public int deleteinvalid(@Param("vid") int vid, @Param("nid") int nid) {
        return messageMapper.deleteinvalid(vid,nid);
    }
}
