package com.heroku.mapper;

import com.heroku.entity.SdaMzHan;
import com.heroku.entity.SdaMzHanExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMzHanMapper {
    int countByExample(SdaMzHanExample example);

    int deleteByExample(SdaMzHanExample example);

    int deleteByPrimaryKey(String sdaHancd);

    int insert(SdaMzHan record);

    int insertSelective(SdaMzHan record);

    List<SdaMzHan> selectByExample(SdaMzHanExample example);

    SdaMzHan selectByPrimaryKey(String sdaHancd);

    List<HashMap> selectByExample2(SdaMzHanExample example);

    HashMap selectByPrimaryKey2(String sdaHancd);

    int updateByExampleSelective(@Param("record") SdaMzHan record, @Param("example") SdaMzHanExample example);

    int updateByExample(@Param("record") SdaMzHan record, @Param("example") SdaMzHanExample example);

    int updateByPrimaryKeySelective(SdaMzHan record);

    int updateByPrimaryKey(SdaMzHan record);
}