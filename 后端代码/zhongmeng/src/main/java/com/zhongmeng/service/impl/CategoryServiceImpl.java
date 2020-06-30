package com.zhongmeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.mapper.CategoryMapper;
import com.zhongmeng.pojo.Category;
import com.zhongmeng.pojo.CategoryExample;
import com.zhongmeng.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int insert(Category record) {

        record.setCreateTime(new Date());
        record.setUpdateTime(new Date());
        return categoryMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        record.setUpdateTime(new Date());
        return categoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Category> findCategoryBytype(Integer pagNum, Integer pageSize, String type) {
        PageHelper.startPage(pagNum,pageSize);

        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andTypeLike("%"+type+"%");
        List<Category> list=categoryMapper.selectByExample(categoryExample);

        return new PageInfo<>(list);
    }


    @Override
    public Category selectByPrimaryKey(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public ServerResponse findCategoryAll() {
        List<Category> categories = categoryMapper.selectByExample(null);
        return ServerResponse.createBySuccess(categories);
    }

}
