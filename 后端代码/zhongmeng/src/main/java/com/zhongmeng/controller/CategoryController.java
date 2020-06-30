package com.zhongmeng.controller;

import com.github.pagehelper.PageInfo;
import com.zhongmeng.common.ServerResponse;
import com.zhongmeng.pojo.Category;
import com.zhongmeng.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 增加类型
     * **/
    @RequestMapping("insert")
    public int insert(Category category){
        return categoryService.insert(category);
    }
    /**
     * 删除一个类型
     * **/
    @RequestMapping("delete")
    public int delete(int id){
        return categoryService.deleteByPrimaryKey(id);
    }
    /**
     * 获得类型下拉框，和查询
     * **/
    @RequestMapping("query")
    public PageInfo<Category> selectList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestParam(value = "type", defaultValue = "") String type){
        return  categoryService.findCategoryBytype(pageNum,pageSize,type);
    }

    /**
     * 修改内容
     * **/
    @RequestMapping("save")
    public int update(Category category){
        return categoryService.updateByPrimaryKey(category);
    }
    /**
     * 加载内容
     * **/
    @RequestMapping("load")
    public Category selectOne(int id){
        return categoryService.selectByPrimaryKey(id);
    }

    @RequestMapping("list")
    public ServerResponse list(){
        return categoryService.findCategoryAll();
    }

}
