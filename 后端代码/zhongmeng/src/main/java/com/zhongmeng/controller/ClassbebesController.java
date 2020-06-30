package com.zhongmeng.controller;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Classbebes;
import com.zhongmeng.service.ClassbebesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("classbebes")
public class ClassbebesController {

    @Autowired
    private ClassbebesService classbebesService;

    //添加选课
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ServerResponse add(Classbebes classbebes) {
        return classbebesService.insertClassbebes(classbebes);
    }

    //上课后更新剩余课时
    @ResponseBody
    @RequestMapping("update")
    public String update(Integer cbid, @RequestParam(value = "subNum", defaultValue = "1") Integer subNum) {
        //000代表操作失败
        //001代表操作成功
        //002代表剩余课时不足
        String msg = "000";
        try {
            msg = classbebesService.updateRemainhoursById(cbid, subNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //修改选课信息
    @ResponseBody
    @RequestMapping("save")
    public ServerResponse save(Classbebes classbebes) {



        return classbebesService.updateClassbebesById(classbebes);
    }

    //加载更新页面
    @ResponseBody
    @RequestMapping("load")
    public Classbebes load(Integer cbid) {
        return classbebesService.findClassbebesById(cbid);
    }

    //查询分页
    @ResponseBody
    @RequestMapping("query")
    public PageInfo<Classbebes> query(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "kname", defaultValue = "") String kname,
                                      @RequestParam(value = "classname", defaultValue = "")String classname) {
        return classbebesService.findClassbebesByName(pageNum, pageSize, kname,classname);
    }

    @ResponseBody
    @RequestMapping("delete")
    public Integer delete(Integer cbid){
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            classbebesService.delClassbebesById(cbid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @ResponseBody
    @RequestMapping("deleteList")
    public Integer deleteList(@RequestParam(value="cbids[]")Integer[] cbids){

        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            classbebesService.delClassbebesByIds(cbids);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
