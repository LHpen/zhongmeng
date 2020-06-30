package com.zhongmeng.service;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Category;
import org.apache.ibatis.annotations.Param;

public interface CategoryService {

    /**
     * 增
     * **/
    int insert(Category record);

    /**
     * 删
     * **/
    int deleteByPrimaryKey(Integer id);

    /**
     * 改
     * **/
    int updateByPrimaryKey(Category record);
    /**
     * 查
     * **/
    PageInfo<Category> findCategoryBytype(@Param("pagNum") Integer pagNum, @Param("pageSize") Integer pageSize, @Param("type") String type);
    /**
     * 加载单条信息
     * **/
    Category selectByPrimaryKey(Integer id);

    ServerResponse findCategoryAll();
}
