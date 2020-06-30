package com.zhongmeng.service;


import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Classbebes;

import java.util.List;

/**
 *选课业务逻辑接口
 */
public interface ClassbebesService {

    /**
     * 插入一条宝宝选课信息
     */
    ServerResponse insertClassbebes(Classbebes classbebes);

    /**
     * 根据ID修改剩余课时
     */
    String updateRemainhoursById(Integer cbid, Integer subNum);

    /**
     * 根据ID更新选课信息
     */
    ServerResponse updateClassbebesById(Classbebes classbebes);

    /**
     * 根据cbid查询选课信息
     * @param cbid
     * @return
     */
    Classbebes findClassbebesById(Integer cbid);

    /**
     * 查询选课信息
     * @return
     */
    PageInfo<Classbebes> findClassbebesByName(Integer pagNum, Integer pageSize, String kname,String classname);
    /**
     * 删除单个选课
     * @param cbid
     */
    void delClassbebesById(Integer cbid);

    /**
     * 批量删除
     * @param cbids
     */
    void delClassbebesByIds(Integer[] cbids);


    /**
     * 获得亲属选的课程
     * **/
    List<Classbebes> findKinsfolk(String vname);



}