package com.zhongmeng.controller;

import com.zhongmeng.pojo.Message;
import com.zhongmeng.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 获得Message表的所有数据（包括和VIP，Notify表的关联）
     * **/
    @ResponseBody
    @RequestMapping("selectAll")
    public List<Message> selectALL(){
        List<Message> message = messageService.selectAll();
        return message;
    }



}
