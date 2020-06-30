package com.zhongmeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.ClassMapper;
import com.zhongmeng.pojo.Class;
import com.zhongmeng.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public PageInfo<Class> findClassByName(Integer pagNum, Integer pageSize,String classname) {
        PageHelper.startPage(pagNum,pageSize);

        if(classname!="") {


            List<Class> list = classMapper.seletAll(classname);
            return new PageInfo<>(list);
        }else if(classname==""){
            List<Class> list = classMapper.seletAll(classname);
            return new PageInfo<>(list);
        }
        return null;
    }


    @Override
    public Class findClassById(Integer classid) {
        return classMapper.selectByPrimaryKey(classid);
    }


    @Override
    public void updateClassById(Class clazz) {
        //根据courseid查询课程信息
//        Course course = courseMapper.selectByPrimaryKey(clazz.getCourseid());
        //根据tid查询教师信息
//        Teachers teachers = teachersMapper.selectByPrimaryKey(clazz.getTid());

        //根据addressid查询地址
//        Address address = addressMapper.selectByPrimaryKey(clazz.getAddressid());

        //设置地址名称
//        clazz.setAddress(address.getAddress());

        //设置课程名字
//        clazz.setCname(course.getCname());

        //设置教师姓名
//        clazz.setTname(teachers.getTname());
        //更新数据库
        classMapper.updateByPrimaryKeySelective(clazz);
    }

    @Override
    public void delClassById(Integer classid) {
        classMapper.deleteByPrimaryKey(classid);
    }

    @Override
    public void addClass(Class aClass) {
        //根据courseid查询课程信息
//        Course course = courseMapper.selectByPrimaryKey(aClass.getCourseid());
        //根据tid查询教师信息
//        Teachers teachers = teachersMapper.selectByPrimaryKey(aClass.getTid());

        //根据addressid查询地址
//        Address address = addressMapper.selectByPrimaryKey(aClass.getAddressid());

        //设置地址名称
//        aClass.setAddress(address.getAddress());

        //设置课程名字
//        aClass.setCname(course.getCname());

        //设置教师姓名
//        aClass.setTname(teachers.getTname());
        //todo 设置固定值
        aClass.setAddressid(1);
        //插入数据库
        classMapper.insertSelective(aClass);
    }

    @Override
    public List<Class> selectALL() {
        return classMapper.selectALL();
    }


}
