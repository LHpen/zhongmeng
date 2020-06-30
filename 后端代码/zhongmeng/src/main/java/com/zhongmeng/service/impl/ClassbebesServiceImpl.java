package com.zhongmeng.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.mapper.*;
import com.zhongmeng.pojo.*;
import com.zhongmeng.pojo.Class;
import com.zhongmeng.service.ClassbebesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassbebesServiceImpl implements ClassbebesService {

    @Autowired
    private ClassbebesMapper classbebesMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ClassMapper classMapper;

    @Autowired
    private TeachersMapper teachersMapper;

    @Autowired
    private VipMapper vipMapper;

    @Autowired
    private KinsfolkMapper kinsfolkMapper;


    @Override
    public ServerResponse insertClassbebes(Classbebes classbebes) {
        int checkKinsfolk = classbebesMapper.checkKinsfolk(classbebes);

        if (checkKinsfolk > 0){
            return ServerResponse.createByErrorMessage("该亲属已经存在此班级里了");
        }
        //根据Id查询班级信息
        Class aClass = classMapper.selectByPrimaryKey(classbebes.getClassid());

        //根据id查询课表的学时
        Course course = courseMapper.selectByPrimaryKey(aClass.getCourseid());


        //设置课程剩余时间
        classbebes.setRemainhours(course.getClasshour());

        classbebesMapper.insertSelective(classbebes);

        return ServerResponse.createBySuccess();
    }


    @Override
    public String updateRemainhoursById(Integer cbid,Integer subNum) {
        String msg = "001";
        //根据cbid查询选课信息
        Classbebes classbebes = classbebesMapper.selectByPrimaryKey(cbid);

        if (classbebes.getRemainhours().intValue() >= subNum.intValue() ){
            classbebes.setRemainhours(classbebes.getRemainhours().intValue() - subNum.intValue());
            classbebesMapper.updateByPrimaryKeySelective(classbebes);
            return msg;
        }else {
            msg = "002";
            return msg;
        }

    }

    @Override
    public ServerResponse updateClassbebesById(Classbebes classbebes) {

        int checkKinsfolk = classbebesMapper.checkKinsfolk(classbebes);

        if (checkKinsfolk > 0){
            return ServerResponse.createByErrorMessage("该亲属已经存在此班级里了");
        }
        //根据Id查询班级信息
        Class aClass = classMapper.selectByPrimaryKey(classbebes.getClassid());


        //根据id查询课表的学时
        Course course = courseMapper.selectByPrimaryKey(aClass.getCourseid());


        //设置课程剩余时间
        classbebes.setRemainhours(course.getClasshour());

        classbebesMapper.updateByPrimaryKeySelective(classbebes);

        return ServerResponse.createBySuccess();
    }

    @Override
    public Classbebes findClassbebesById(Integer cbid) {
        return classbebesMapper.selectByPrimaryKey(cbid);
    }

    @Override
    public PageInfo<Classbebes> findClassbebesByName(Integer pagNum, Integer pageSize, String kname,String classname) {
        PageHelper.startPage(pagNum,pageSize);
        System.out.println(pagNum+" "+pageSize);
        List<Classbebes> list = classbebesMapper.SelectThreeTable(kname, classname);
//        if(kname!=null){
//            if(classname!=null) {
//                List<Classbebes> list = classbebesMapper.SelectThreeTable(kname, classname);
//                return new PageInfo<>(list);
//            }else if(classname==null){
//                classname="";
//                List<Classbebes> list = classbebesMapper.SelectThreeTable(kname, classname);
//                return new PageInfo<>(list);
//            }
//        }else if(kname==null){
//            if(classname!=null) {
//                kname="";
//                List<Classbebes> list = classbebesMapper.SelectThreeTable(kname, classname);
//                return new PageInfo<>(list);
//            }else if(classname==null) {
//                classname = "";
//                kname = "";
//                List<Classbebes> list = classbebesMapper.SelectThreeTable(kname, classname);
//                return new PageInfo<>(list);
//            }
//        }
        return new PageInfo<>(list);
    }

    @Override
    public void delClassbebesById(Integer cbid) {
        classbebesMapper.deleteByPrimaryKey(cbid);
    }

    @Override
    public void delClassbebesByIds(Integer[] cbids) {
        List<Integer> list = new ArrayList<>();
        for (Integer cbid : cbids) {
            list.add(cbid);
        }
        ClassbebesExample example = new ClassbebesExample();
        ClassbebesExample.Criteria criteria = example.createCriteria();
        criteria.andCbidIn(list);

        classbebesMapper.deleteByExample(example);
    }

    @Override
    public List<Classbebes> findKinsfolk(String vname) {
        return classbebesMapper.findKinsfolk(vname);
    }


}
