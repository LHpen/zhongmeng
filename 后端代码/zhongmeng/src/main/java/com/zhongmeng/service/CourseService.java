package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Course;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {

    /**
     * 查询全部课程信息
     * @return
     */
    PageInfo<Course> findCourseByName(Integer pagNum, Integer pageSize, String cname);

    /**
     * 根据主键加载课程详细信息
     * @param courseid
     * @return
     */
    Course findCourseById(Integer courseid);

    /**
     * 根据主键修改课程信息
     * @param course
     */
    void updateCourseById(MultipartFile upload, Course course) throws IOException;

    /**
     * 根据主键删除课程信息
     * @return
     */
    void delCourseById(Integer courseid);

    /**
     * 插入课程信息
     * @param course
     */
    void addCourse(Course course);

    /**
     * 查询所有
     * @return
     */
    List<Course> findCourse();

    void updateCourseByCimg(Integer key);
}
