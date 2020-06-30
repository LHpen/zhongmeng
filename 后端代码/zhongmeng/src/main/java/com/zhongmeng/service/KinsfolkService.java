package com.zhongmeng.service;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.pojo.Kinsfolk;
import com.zhongmeng.pojo.KinsfolkVo;

import java.util.List;

/**
 * 亲属信息业务逻辑接口
 */
public interface KinsfolkService {

    PageInfo<KinsfolkVo> selectByExample(Integer pagNum, Integer pageSize, String kname);

    int insert(Kinsfolk record);

    int deleteByPrimaryKey(Integer kbid);

    int updateByPrimaryKey(Kinsfolk record);


    Kinsfolk findBebeByid(Integer kid);

    List<Kinsfolk> findBebeList();

    List<Kinsfolk> findBebeByVid(int vid);

}
