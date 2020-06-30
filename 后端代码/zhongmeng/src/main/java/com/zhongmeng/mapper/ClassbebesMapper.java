package com.zhongmeng.mapper;

import com.zhongmeng.pojo.Classbebes;
import com.zhongmeng.pojo.ClassbebesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassbebesMapper {
    long countByExample(ClassbebesExample example);

    int deleteByExample(ClassbebesExample example);

    int deleteByPrimaryKey(Integer cbid);

    int insert(Classbebes record);

    int insertSelective(Classbebes record);

    List<Classbebes> selectByExample(@Param("example")ClassbebesExample example);

    List<Classbebes> SelectThreeTable(@Param("kname")String kname,@Param("classname") String classname);

    Classbebes selectByPrimaryKey(Integer cbid);

    int updateByExampleSelective(@Param("record") Classbebes record, @Param("example") ClassbebesExample example);

    int updateByExample(@Param("record") Classbebes record, @Param("example") ClassbebesExample example);

    int updateByPrimaryKeySelective(Classbebes record);

    int updateByPrimaryKey(Classbebes record);

    List<Classbebes> findKinsfolk(String vname);

    /**
     * 检查该班级下是否已经存在该亲属
     * @param record
     * @return
     */
    int checkKinsfolk(Classbebes record);

}