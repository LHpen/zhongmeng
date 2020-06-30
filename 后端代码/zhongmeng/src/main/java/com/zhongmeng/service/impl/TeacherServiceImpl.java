package com.zhongmeng.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.mapper.TeachersMapper;
import com.zhongmeng.pojo.Category;
import com.zhongmeng.pojo.Teachers;
import com.zhongmeng.pojo.TeachersExample;
import com.zhongmeng.service.TeachersService;
import com.zhongmeng.vo.TeachersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 教师信息表业务逻辑实现类
 */
@Service
public class TeacherServiceImpl implements TeachersService {

    @Autowired
    private TeachersMapper teachersMapper;

    @Override
    public List<Teachers> selectByExample(String tname) {
        TeachersExample example = new TeachersExample();
        TeachersExample.Criteria criteria = example.createCriteria();
        criteria.andTnameLike("%"+tname+"%");
        return teachersMapper.selectByExample(example);
    }

    @Override
    public PageInfo<TeachersVo> findTeachersByname(Integer pagNum, Integer pageSize, String tname) {
        PageHelper.startPage(pagNum,pageSize);


        List<TeachersVo> list = teachersMapper.selectByTname(tname);




        String type = "";
        for (TeachersVo teachersVo : list) {
            for (Category category : teachersVo.getTtype()) {
                type += category.getType() + ",";
            }
            String substring = type.substring(0, type.length() - 1);
            teachersVo.setType(substring);
            type = "";
        }

        PageInfo<TeachersVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Teachers> selectALL() {
        return teachersMapper.selectALL();
    }


    @Override
    public TeachersVo findTeachersById(Integer tid) {

        return teachersMapper.selectByid(tid);
    }

    @Override
    public void updateTeachersById(Teachers teachers) {
        teachersMapper.updateByPrimaryKeySelective(teachers);
    }

    @Override
    public void delTeacherById(Integer tid) {
        teachersMapper.deleteByPrimaryKey(tid);
    }

    @Override
    public void addTeacher(Teachers teachers) {
        teachersMapper.insertSelective(teachers);
    }

    @Override
    public void updateTeachersByCimg(Integer key){
        Teachers teachers = new Teachers();
        teachers.setTid(key);
        teachers.setTimg("");
        teachersMapper.updateByPrimaryKeySelective(teachers);
    }

    @Override
    public int selectDescLimt() {
        return teachersMapper.selectDescLimt();
    }
}
