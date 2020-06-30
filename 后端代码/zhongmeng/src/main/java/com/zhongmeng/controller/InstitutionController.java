package com.zhongmeng.controller;


import com.zhongmeng.pojo.Institution;
import com.zhongmeng.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 机构信息控制器类
 */
@Controller
@RequestMapping("institution")
public class InstitutionController {
    @Autowired
    private InstitutionService institutionService;

    /**
     * 初始化页面
     * @return
     */
    @ResponseBody
    @RequestMapping("list")
    public List<Institution> list(){
        return  institutionService.findInstitutionList();
    }


    @ResponseBody
    @RequestMapping("query")
    public List<Institution> query(String insname){
        return institutionService.findInstitutionByName(insname);
    }

    @ResponseBody
    @RequestMapping("update")
    public Institution update(Integer insid){
        return institutionService.findInstitutionByInsid(insid);
    }

    @ResponseBody
    @RequestMapping("save")
    public Integer save(Institution institution){
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            institutionService.saveInstitution(institution);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return msg;
    }

    @ResponseBody
    @RequestMapping("delete")
    public Integer delete(Integer insid){
        //1代表删除成功 0代表失败
        Integer msg = 0;
        try {
            institutionService.delInstitutionByInsid(insid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
    
}
