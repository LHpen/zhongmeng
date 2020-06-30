package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Class;

import java.util.List;

public interface ClassService {

    /**
     * 查询班级信息
     * @return
     */
    PageInfo<Class> findClassByName(Integer pagNum, Integer pageSize,String classname);

    /**
     * 根据主键加载班级详细信息
     * @param classid
     * @return
     */
    Class findClassById(Integer classid);

    /**
     * 根据主键修改班级信息
     * @param clazz
     */
    void updateClassById(Class clazz);

    /**
     * 根据主键删除班级信息
     * @return classid
     */
    void delClassById(Integer classid);

    /**
     * 插入班级信息
     * @param aClass
     */
    void addClass(Class aClass);

    List<Class> selectALL();

}
