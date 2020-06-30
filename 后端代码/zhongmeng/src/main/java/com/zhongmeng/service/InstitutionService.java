package com.zhongmeng.service;


import com.zhongmeng.pojo.Institution;

import java.util.List;

/**
 * 机构信息业务逻辑接口
 */
public interface InstitutionService {

    /**
     * 查询机构信息列表
     * @return List<Institution>
     */
    List<Institution> findInstitutionList();

    /**
     * 根据机构名字查询
     * @return List<Institution>
     */
    List<Institution> findInstitutionByName(String insname);

    /**
     * 根据id加载机构信息
     * @param insid
     * @return
     */
    Institution findInstitutionByInsid(Integer insid);

    /**
     * 根据ID修改机构信息
     * @param institution
     * @return
     */
    void saveInstitution(Institution institution);

    /**
     * 根据ID删除机构信息
     * @param insid
     * @return
     */
    void delInstitutionByInsid(Integer insid);
}
