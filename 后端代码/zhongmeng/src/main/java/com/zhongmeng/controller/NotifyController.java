package com.zhongmeng.controller;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Notify;
import com.zhongmeng.service.MessageService;
import com.zhongmeng.service.NotifyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("notify")
public class NotifyController {
    @Autowired
    private NotifyService notifyService;

    @Autowired
    private MessageService messageService;

    /**
     * 前端需传：
     * nthemen :主题
     * ncontent :内容
     * ntype :消息类型，请用下拉框传  所有人 或 单人 给接口
     * vid :用户表的主键vid
     **/
    @ResponseBody
    @RequestMapping("addMessage")
    public int insert(@Param("ntheme") String ntheme, @Param("ncontent") String ncontent, @Param("ntype") String ntype,@Param("nimg")String nimg) {
        int msg = 0;
        String nstate = "有效";
//        if (ntype.equals("所有人")) {
//            vid = 0;
//        }
        if ((notifyService.insert(ntheme, ncontent, ntype, nstate,nimg)) > 0) {
            int nid = notifyService.selectMAXID();
            String mstate = "未读";
            int s = messageService.insert(nid, mstate);
            msg = 1;
        }
        return msg;
    }

//    /**
//     * 传下拉框内的内容
//     * **/
//    @ResponseBody
//    @RequestMapping("addNotify")
//    public int insert(@Param("ntheme1") String ntheme1,@Param("ncontent1") String ncontent1,@Param("ntype") String ntype){
//        int msg=0;
//        String nstate = "有效";
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
//        String ntheme = ""+sdf.format(date)+"今天我们社区"+ntheme1+"+1";
//
//        String ncontent ="欢迎"+ncontent1+"于"+sdf.format(date)+"入驻我们社区";
//        if((notifyService.insert(ntheme,ncontent,ntype,nstate))>0){
//            msg=1;
//        }
//        return msg;
//    }

    /**
     * 根据主键nid修改内容
     **/
    @ResponseBody
    @RequestMapping("update")
    public Notify update(Integer nid) {
        return notifyService.findNotifyById(nid);
    }

    @ResponseBody
    @RequestMapping("delete")
    public int deleteID(int nid) {
        int msg = 0;
        try {
            notifyService.deleteByKey(nid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @ResponseBody
    @RequestMapping("query")
    public PageInfo<Notify> selectAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "ntheme", defaultValue = "") String ntheme) {
        return notifyService.selectByExample(pageNum, pageSize, ntheme);
    }

    //修改信息
    @ResponseBody
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Integer save(Notify notify) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            notifyService.updateNotifyById(notify);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

}
