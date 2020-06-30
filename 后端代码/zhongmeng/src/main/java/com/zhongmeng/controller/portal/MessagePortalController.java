package com.zhongmeng.controller.portal;


import com.zhongmeng.service.MessageService;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("MessagePortal")
public class MessagePortalController {
    @Autowired
    private MessageService messageService;


    /**
     * 传给前端页面，用户未读消息的个数
     * **/
    @ResponseBody
    @RequestMapping("unread")
    public Integer Read(Integer vid){
        Integer msg =messageService.Read(vid);
        return msg;
    }



//已经并入点击消息的的时候便修改了
//    /**
//     * 前端点击页面，更改阅读状态为 已读
//     * **/
//    @ResponseBody
//    @RequestMapping("changRead")
//    public int changRead(int vid,int nid){
//        int  msg=0;
//        if ((messageService.changRead(vid,nid))>0){
//            msg=1;
//        }
//        return msg;
//    }
}
