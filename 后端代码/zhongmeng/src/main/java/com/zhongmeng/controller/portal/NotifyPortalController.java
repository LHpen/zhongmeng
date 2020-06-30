package com.zhongmeng.controller.portal;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Notify;
import com.zhongmeng.service.MessageService;
import com.zhongmeng.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("NotifyPortal")
public class NotifyPortalController {

    @Autowired
    private NotifyService notifyService;
    @Autowired
    private MessageService messageService;


    /**
     * 查看某条信息，并修改其状态
     * 倘若消息失效则删除这条信息
     * **/
    @ResponseBody
    @RequestMapping("ReadChange")
    public Notify select(int vid,int nid) {
        System.out.println(vid+"+++"+nid);
        Notify notify = notifyService.selectALLMessage(nid);
        System.out.println(notify);
        if (notify != null) {
            messageService.changRead(vid, nid);
        }
        return notify;
    }


    /**
     * 获得所有消息列表
     * **/
    @ResponseBody
    @RequestMapping("list")
    public PageInfo<Notify> slectALL(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize){
        PageInfo<Notify> notify = notifyService.selectALL(pageNum,pageSize);
        return notify;
    }

}
