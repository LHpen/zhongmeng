package com.zhongmeng.controller;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Managers;
import com.zhongmeng.service.ManagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 管理员控制类
 */
@Controller
@RequestMapping("managers")
public class ManagersController {


    @Autowired
    private ManagersService managersService;


    /**
     * 登录
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Integer toLogin(@RequestBody Managers managers, HttpServletRequest httpServletRequest) {
        System.out.println(managers);
        Integer msg = 0;

        Managers managers1 = null;
        try {
            managers1 = managersService.toLogin(managers.getMloginname(), managers.getMpw());
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (managers1 != null) {
            HttpSession session = httpServletRequest.getSession();

            session.setAttribute("managers", managers1);
            msg = 2;

        }

        return msg;

    }
//    /**
//     * 登录
//     * */
//    @RequestMapping(value="/login",method = RequestMethod.POST)
//    @ResponseBody
//    public String toLogin(Managers managers,HttpServletRequest httpServletRequest){
//
//        Managers managers1 = null;
//
//
//            if((managers1 = managersService.toLogin(managers.getMloginname(),managers.getMpw()))!=null){
//                Map<String,String> map=new HashMap<>();
//                map.put("mloginname",managers.getMloginname());
//                map.put("mpw",managers.getMpw());
//
//                String token = JwtUtils.genToken(map);
//
//                 HttpSession session = httpServletRequest.getSession();
//                 session.setAttribute("managers",managers1);
//                 session.setAttribute("token",token);
//
//                return "1";
//            }else{
//                return "0";
//            }
//    }
//    /**
//     * 通过前端传来的Token中获得Token中的数据进行验证是否正确，是否过期
//     * **/
//    @RequestMapping("/getData")
//    @ResponseBody
//    public String getData(String token){
//        String res=null;
//        Managers managers1 = null;
//        try{
//            Map<String,String> resMap=JwtUtils.verifyToken(token);
//            String mloginname=resMap.get("mloginname");
//            String mpw=resMap.get("mpw");
//            if((managers1 = managersService.toLogin(mloginname,mpw))!=null){
//                res="Token_true";
//            }
//        }catch (Exception e){
//            res="token_false";
//        }
//            return res;
//    }

    /**
     * 注销退出
     **/
    @RequestMapping("logout")
    public String logout(HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession();

        session.removeAttribute("managers");
        return "Login";//可能这里要改
    }

    //查询管理员信息
    @ResponseBody
    @RequestMapping(value = "query", method = RequestMethod.GET)
    public PageInfo<Managers> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "mname", defaultValue = "") String mname) {
        return managersService.findManagersByname(pageNum, pageSize, mname);
    }


    /**
     * 通过主键删除某行
     */
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    @ResponseBody
    public int deletPKey(int mid) {
        return managersService.deleteByPrimaryKey(mid);
    }

    /**
     * 插入数据
     */
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public int insertSelective(Managers record) {
        System.out.println(record);
        return managersService.insertSelective(record);
    }

    /**
     * 通过主键修改数据内容
     **/
    @ResponseBody
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public int updateByPrimaryKeySelective(Managers record) {
        return managersService.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过主键查询管理员
     */
    @ResponseBody
    @RequestMapping(value = "update", method = RequestMethod.GET)
    public Managers selectByPrimaryKey(Integer mid) {
        return managersService.selectByPrimaryKey(mid);
    }

}
