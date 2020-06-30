package com.zhongmeng.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.Config;
import com.zhongmeng.mapper.CourseMapper;
import com.zhongmeng.pojo.Course;
import com.zhongmeng.pojo.CourseExample;
import com.zhongmeng.service.CourseService;
import com.zhongmeng.utils.ImgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public PageInfo<Course> findCourseByName(Integer pagNum, Integer pageSize, String cname) {
        PageHelper.startPage(pagNum,pageSize);


        List<Course> list = courseMapper.selectByCname(cname);

        for (Course course : list) {
            if (course.getCimg() != null && course.getCimg() != "") {
                course.setCimg(Config.getImgHttpUrl() + course.getCimg());
            }
        }
        return new PageInfo<>(list) ;
    }

    @Override
    public Course findCourseById(Integer courseid) {
        return courseMapper.selectByPrimaryKey(courseid);
    }

    @Override
    public void updateCourseById(MultipartFile upload, Course course) throws IOException {
        if (upload != null){
            String fileName = ImgUtil.uploading(upload);
            //设置数据库图片名字
            course.setCimg(fileName);
        }

        courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    public void delCourseById(Integer courseid) {
        courseMapper.deleteByPrimaryKey(courseid);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.insertSelective(course);
    }




    @Override
    public List<Course> findCourse() {
        return  courseMapper.selectALL();
    }

    @Override
    public void updateCourseByCimg(Integer key){
        Course course = new Course();
        course.setCimg("");
        course.setCourseid(key);
        courseMapper.updateByPrimaryKeySelective(course);
    }

}
