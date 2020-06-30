package com.zhongmeng.service.impl;


import com.zhongmeng.mapper.InstitutionMapper;
import com.zhongmeng.pojo.Institution;
import com.zhongmeng.pojo.InstitutionExample;
import com.zhongmeng.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 机构信息业务逻辑实现类
 */
@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private InstitutionMapper institutionMapper;


    @Override
    public List<Institution> findInstitutionList() {
        return institutionMapper.selectByExample(null);
    }

    @Override
    public List<Institution> findInstitutionByName(String insname) {
        InstitutionExample example = new InstitutionExample();
        InstitutionExample.Criteria criteria = example.createCriteria();
        criteria.andInsnameLike("%"+insname+"%");
        return institutionMapper.selectByExample(example);
    }

    @Override
    public Institution findInstitutionByInsid(Integer insid) {
        return institutionMapper.selectByPrimaryKey(insid);
    }

    @Override
    public void saveInstitution(Institution institution) {
        institutionMapper.updateByPrimaryKeySelective(institution);
    }

    @Override
    public void delInstitutionByInsid(Integer insid) {
        institutionMapper.deleteByPrimaryKey(insid);
    }
}
