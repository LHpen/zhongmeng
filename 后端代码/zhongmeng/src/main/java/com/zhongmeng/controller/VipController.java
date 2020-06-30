package com.zhongmeng.controller;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.Config;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Vip;
import com.zhongmeng.service.VipService;
import com.zhongmeng.utils.AuthUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;


@Controller
@RequestMapping("vip")
public class VipController {

    @Autowired
    private VipService vipService;



    //微信公众号授权登录
    @RequestMapping("wxLogin")
    public String wxLogin() throws UnsupportedEncodingException {
        //回调地址,要跟下面的地址能调通(getWechatGZAccessToken.do)
        String backUrl = Config.getHttpUrl() +"vip/backUrl";
        /**
         *这儿一定要注意！！首尾不能有多的空格（因为直接复制往往会多出空格），其次就是参数的顺序不能变动
         **/
        //AuthUtil.APPID微信公众号的appId
        String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + AuthUtil.APPID +
                "&redirect_uri=" + URLEncoder.encode(backUrl, "UTF-8") +
                "&response_type=code" +
                "&scope=snsapi_userinfo" +
                "&state=STATE#wechat_redirect";
        return "redirect:" + url;
    }

    @RequestMapping("backUrl")
    public String backUrl(String code, HttpServletRequest httpServletRequest, HttpServletResponse  httpServletResponse) throws IOException {
        System.out.println(code);
        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + AuthUtil.APPID+
                "&secret=" + AuthUtil.APPSECRET +
                "&code=" + code +
                "&grant_type=authorization_code";
        JSONObject jsonObject = AuthUtil.doGetJson(url);
        String access_token = jsonObject.getString("access_token");
        String openid = jsonObject.getString("openid");

        String infoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token +
                "&openid=" + openid +
                "&lang=zh_CN";

        JSONObject user = AuthUtil.doGetJson(infoUrl);

        try {
            openid=jsonObject.getString("openid");

            String nickname = user.getString("nickname");

            String headimgurl = user.getString("headimgurl");

            HttpSession session = httpServletRequest.getSession();

            if((vipService.selectId(openid))==0) {
                vipService.insertWeixin(openid,nickname,headimgurl);

                session.setAttribute("openid",openid);
//                httpServletRequest.getRequestDispatcher("checkVip").forward(httpServletRequest,httpServletResponse);
                return "redirect:/index.html";

            }else{

                session.setAttribute("openid",openid);
//                weixinService.update(openid,nickname,sex,language,city,province,country,headimgurl,privilege);
//                httpServletRequest.getRequestDispatcher("checkVip").forward(httpServletRequest,httpServletResponse);
                return "redirect:/index.html";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/index.html";
    }

    @ResponseBody
    @RequestMapping("checkVip")
    public Vip Check(HttpSession session){
        String openid = (String) session.getAttribute("openid");
        Vip vip = null;
        if (openid != null){
            vip = vipService.findVipByOpenid(openid);
            System.out.println(vip);
        }
        return vip;
    }
    /**
     * 会员添加
     **/
    @ResponseBody
    @RequestMapping(value = "add")
    public int insert( Vip record) {

        return vipService.insert(record);

    }

    /**
     * 通过Key删除会员
     **/
    @ResponseBody
    @RequestMapping(value = "delete")
    public int delete(Integer vid) {
        int msg = 0;
        try {
            vipService.deleteByPrimaryKey(vid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 通过Key更新会员信息
     **/
    @ResponseBody
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Integer save(Vip record) {

        int msg = 0;
        try {
            vipService.updateByPrimaryKey(record);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 查询会员用户的信息
     **/
    @ResponseBody
    @RequestMapping(value = "query")
    public PageInfo<Vip> query(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "vname", defaultValue = "") String vname) {
        return vipService.selectByExample(pageNum, pageSize, vname);
    }

    //加载个人信息页面
    @ResponseBody
    @RequestMapping("update")
    public Vip update(Integer vid) {
        return vipService.findVipById(vid);
    }

    @ResponseBody
    @RequestMapping("list")
    public List<Vip> list(){
        return vipService.findAll();
    }

}
