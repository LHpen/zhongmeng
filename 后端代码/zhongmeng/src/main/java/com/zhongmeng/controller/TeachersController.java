package com.zhongmeng.controller;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.Config;
import com.zhongmeng.pojo.Teachers;
import com.zhongmeng.pojo.more_type;
import com.zhongmeng.service.TeachersService;
import com.zhongmeng.service.more_typeService;
import com.zhongmeng.utils.ImgUtil;
import com.zhongmeng.utils.WangEditor;
import com.zhongmeng.vo.TeachersVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 教师信息控制类
 */
@Controller
@RequestMapping("teachers")
public class TeachersController {

    @Autowired
    private TeachersService teachersService;

    @Autowired
    private more_typeService moreTypeService;


    //图片上传
    @ResponseBody
    @RequestMapping("test")
    public WangEditor test(@RequestParam(value = "upload",required = false) List<MultipartFile> upload, Teachers teachers) throws IOException {

        //保存数据库的路径
        String sqlPath = null;

        //定义 文件名
        String filename = null;
        //声明 返回图片路径集合
        List<String> list = new ArrayList<>();

        WangEditor wangEditor = new WangEditor();

        if (upload != null && upload.size() != 0) {
            for (MultipartFile multipartFile : upload) {
                //生成uuid作为文件名称
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                //获得文件类型（可以判断如果不是图片，禁止上传）
                String contentType = multipartFile.getContentType();
                //获得文件后缀名
                String suffixName = contentType.substring(contentType.indexOf("/") + 1);
                //得到 文件名
                filename = uuid + "." + suffixName;
                //文件保存路径 Config3.localPath固定路径
                multipartFile.transferTo(new File(Config.getLocalPath() + filename));
                //设置返回图片路径集合
                list.add(Config.getImgHttpUrl() + filename);
        }

            wangEditor.setErrno(0);
            //imgHttpUrl图片域名地址
            String[] imgs = new String[list.size()];
            wangEditor.setData(list.toArray(imgs));
            return wangEditor;
        }
        wangEditor.setErrno(1);
        return wangEditor;

    }

    //查询教师信息
    @ResponseBody
    @RequestMapping("query")
    public PageInfo<TeachersVo> query(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "tname", defaultValue = "") String tname) {
        return teachersService.findTeachersByname(pageNum, pageSize, tname);
    }



    @ResponseBody
    @RequestMapping(value = "list")
    public List<Teachers> selec(@RequestParam(value = "tname", defaultValue = "") String tname) {
        return teachersService.selectALL();
    }

    //加载教师信息编辑页面
    @ResponseBody
    @RequestMapping("update")
    public TeachersVo update(Integer tid) {
        TeachersVo teachers = teachersService.findTeachersById(tid);
        if(teachers.getTimg() != null && teachers.getTimg() != ""){
            teachers.setTimg(Config.getImgHttpUrl() + teachers.getTimg());
        }
        return teachers;
    }

    //修改教师信息
    @ResponseBody
    @RequestMapping("save")
    public Integer save(MultipartFile upload,Teachers teachers,@Param("ttypes") int[] ttypes) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            if (upload != null) {
                String fileName = ImgUtil.uploading(upload);
                //设置数据库图片名字
                teachers.setTimg(fileName);
            }

            teachersService.updateTeachersById(teachers);
            int T_id=teachers.getTid();
            int C_id;
            if(moreTypeService.delete(teachers.getTid())>0){
                more_type more_type=new more_type();
                for(int i=0;i<ttypes.length;i++){
                    C_id=ttypes[i];
                    more_type.setC_id(C_id);
                    more_type.setT_id(T_id);
                    moreTypeService.insert(more_type);
                }
            }
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //删除教师信息
    @ResponseBody
    @RequestMapping("delete")
    public Integer delete(Integer tid) {
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            teachersService.delTeacherById(tid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //添加教师信息
    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Integer add(MultipartFile upload,Teachers teachers,@Param("ttypes") int[] ttypes) {

        int C_id;
        Integer msg = 0;
        try {
            //声明 返回图片路径集合
            if (upload != null) {
                String fileName = ImgUtil.uploading(upload);
                //设置数据库图片名字
                teachers.setTimg(fileName);
            }
            int type=teachersService.selectDescLimt()+1;//获得目前teacher表的最新主键数，+1后等同于即将存储的数据的主键id

            System.out.println(type);
            teachers.setTtype(type);
            teachersService.addTeacher(teachers);


            more_type more_type=new more_type();
            for(int i=0;i<ttypes.length;i++){
                C_id=ttypes[i];
                more_type.setC_id(C_id);
                more_type.setT_id(type);
                moreTypeService.insert(more_type);
            }
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 删除文件
     * @param key
     * @param img
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteImg")
    public Integer deleteImg(Integer key,String img){
        Integer msg = 0;
        try {
            File file = new File(Config.getLocalPath(),img);
            if(file.exists()) {
                file.delete();
            }
            teachersService.updateTeachersByCimg(key);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return msg;
    }
}
