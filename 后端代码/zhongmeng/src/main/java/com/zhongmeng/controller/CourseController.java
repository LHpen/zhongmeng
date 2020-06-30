package com.zhongmeng.controller;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.Config;
import com.zhongmeng.pojo.Course;
import com.zhongmeng.service.CourseService;
import com.zhongmeng.utils.ImgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 课程信息控制类
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    //查询课程信息
    @ResponseBody
    @RequestMapping(value = "query",method = RequestMethod.GET)
    public PageInfo<Course> list(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestParam(value = "cname",defaultValue = "")String cname){
        return courseService.findCourseByName(pageNum,pageSize,cname);
    }



    //加载课程信息编辑页面
    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public Course update(Integer courseid){
        Course course = courseService.findCourseById(courseid);
        if(course.getCimg() != null && course.getCimg() != "") {
            course.setCimg(Config.getImgHttpUrl() + course.getCimg());
        }
        return course;
    }

    //修改班级信息
    @ResponseBody
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Integer save(MultipartFile upload,Course course) {


        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            courseService.updateCourseById(upload,course);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //删除课程信息
    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public Integer delete(Integer courseid){

        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            courseService.delCourseById(courseid);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    //添加新课程
    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Integer add(MultipartFile upload,Course course){
        //1代表更新成功 0代表失败
        Integer msg = 0;
        try {
            //声明 返回图片路径集合
            if (upload != null){
                String fileName = ImgUtil.uploading(upload);
                //设置数据库图片名字
                course.setCimg(fileName);
            }
            courseService.addCourse(course);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    /**
     * 删除文件
     * @param key
     * @param cimg
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteImg")
    public Integer deleteImg(Integer key,String cimg){
        Integer msg = 0;
        try {
            File file = new File(Config.getLocalPath(),cimg);
            if(file.exists()) {
                file.delete();
            }
            courseService.updateCourseByCimg(key);
            msg = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return msg;
    }


    @ResponseBody
    @RequestMapping(value = "list")
    public List<Course> list(){
        return courseService.findCourse();
    }
}
