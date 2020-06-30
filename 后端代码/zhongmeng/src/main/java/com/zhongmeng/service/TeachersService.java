package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Teachers;
import com.zhongmeng.vo.TeachersVo;

import java.util.List;

/**
 * 教师信息表业务逻辑实现类
 */
public interface TeachersService {

    /**
     * 查询所有教师信息
     * **/
    List<Teachers> selectByExample(String tname);

    /**通过页面页数
     * 查询全部教师信息
     * @return
     */
    PageInfo<TeachersVo> findTeachersByname(Integer pagNum, Integer pageSize, String tname);

    List<Teachers> selectALL();

    /**
     * 根据主键加载教师信息
     * @param tid
     * @return
     */
    TeachersVo findTeachersById(Integer tid);

    /**
     * 根据主键修改教师信息
     * @param teachers
     */
    void updateTeachersById(Teachers teachers);

    /**
     * 根据主键删除教师信息
     */
    void delTeacherById(Integer tid);

    /**
     * 插入一条教师信息
     * @param teachers
     */
    void addTeacher(Teachers teachers);

    /**
     * 删除图片
     * @param key
     */
    void updateTeachersByCimg(Integer key);

    /**
     * 查询最新的一条数据的id
     * **/
    int selectDescLimt();
}
