package com.zhongmeng.controller;

import com.zhongmeng.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

//做初始化页面的数据
@Controller
@RequestMapping("load")
public class LoadContoller {

    @Autowired
    LoadService loadService;

    @ResponseBody
    @RequestMapping("index")
    public Map<String,Object> index(){
        return loadService.LoadIndex();
    }
}
