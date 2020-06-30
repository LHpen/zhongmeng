package com.zhongmeng.controller;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Class;
import com.zhongmeng.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 开班信息控制类
 */

@Controller
@RequestMapping("class")
public class ClassController {

    @Autowired
    private ClassService classService;

    //查询班级信息
    @ResponseBody
    @RequestMapping(value = "query", method = RequestMethod.GET)
    public PageInfo<Class> query(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "classname", defaultValue = "") String classname) {
        return classService.findClassByName(pageNum, pageSize, classname);
    }

    @ResponseBody
    @RequestMapping(value = "list")
    public List select(@RequestParam(value = "classname", defaultValue = "") String classname) {
        return classService.selectALL();
    }

    //加载班级信息编辑页面
    @ResponseBody
    @RequestMapping(value = "update", method = RequestMethod.GET)
    public Class update(Integer classid) {
        return classService.findClassById(classid);
    }

    //修改班级信息
    @ResponseBody
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Integer save(Class clazz) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            classService.updateClassById(clazz);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //删除班级信息
    @ResponseBody
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public Integer delete(Integer classid) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            classService.delClassById(classid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //新开班级
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Integer add(Class aClass) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            classService.addClass(aClass);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
