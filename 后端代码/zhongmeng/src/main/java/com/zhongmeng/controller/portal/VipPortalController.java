package com.zhongmeng.controller.portal;

import com.zhongmeng.pojo.Classbebes;
import com.zhongmeng.pojo.Vip;
import com.zhongmeng.service.ClassbebesService;
import com.zhongmeng.service.KinsfolkService;
import com.zhongmeng.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("VipPortal")
public class VipPortalController {

    @Autowired
    private VipService vipService;
    @Autowired
    private ClassbebesService classbebesService;
    @Autowired
    private KinsfolkService kinsfolkService;



    /**
     * 用户个人主页修改自己信息功能
     * **/
    @ResponseBody
    @RequestMapping("updateMessage")
    public int update(Vip vip){

        int msg= 0;
        if((vipService.updateByPrimaryKey(vip))>0){
            msg=1;
        }
        return msg;
    }

    /**
     * 查看个人信息
     * **/
    @ResponseBody
    @RequestMapping("findVip")
    public Vip find(int vid){
        Vip vip=vipService.findVipById(vid);
        return vip;
    }

    /**
     * 查看自己亲属的课程信息
     * **/
    @ResponseBody
    @RequestMapping("KinsfolkList")
    public List<Classbebes> findAll(int vid){
        List<Classbebes> list=null;
        String vname=vipService.selectVname(vid);

        list = classbebesService.findKinsfolk(vname);
        return list;
    }

}
