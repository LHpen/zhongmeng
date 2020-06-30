package com.zhongmeng.controller;



import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Kinsfolk;
import com.zhongmeng.pojo.KinsfolkVo;
import com.zhongmeng.service.KinsfolkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 宝宝信息控制器类
 */
@Controller
@RequestMapping("kinsfolk")
public class KinsfolkController {

    @Autowired
    private KinsfolkService kinsfolkService;


    /**
     * 添加家属
     * */
    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Integer insertBebe(Kinsfolk kinsfolk){

        Integer msg = 0;
        try {
            kinsfolkService.insert(kinsfolk);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 搜索家属信息
     * */
    @ResponseBody
    @RequestMapping(value = "query",method = RequestMethod.GET)
   public PageInfo<KinsfolkVo> query(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestParam(value = "kname",defaultValue = "")String kname){
        return kinsfolkService.selectByExample(pageNum,pageSize,kname);
    }
    /**
     * 通过主键删除某行
     * */
    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public int deleteByPrimaryKeyBebe(Integer kid){
        Integer msg = 0;
        try {
            kinsfolkService.deleteByPrimaryKey(kid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 通过主键更新某行内容
     * */
    @ResponseBody
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Integer updateByPrimaryKeyBebe(Kinsfolk record){
        Integer msg = 0;
        System.out.println(record);
        try {
            kinsfolkService.updateByPrimaryKey(record);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public Kinsfolk update(Integer kid){

        return kinsfolkService.findBebeByid(kid);
    }


    @ResponseBody
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Kinsfolk> list(){
        return kinsfolkService.findBebeList();
    }


    @ResponseBody
    @RequestMapping("ByVid")
    public List<Kinsfolk> kinsfolkList(int vid){
        return kinsfolkService.findBebeByVid(vid);
    }

}
