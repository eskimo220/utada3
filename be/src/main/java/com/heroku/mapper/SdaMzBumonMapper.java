package com.heroku.mapper;

import com.heroku.entity.SdaMzBumon;
import com.heroku.entity.SdaMzBumonExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMzBumonMapper {
    int countByExample(SdaMzBumonExample example);

    int deleteByExample(SdaMzBumonExample example);

    int deleteByPrimaryKey(String sdaBumoncd);

    int insert(SdaMzBumon record);

    int insertSelective(SdaMzBumon record);

    List<SdaMzBumon> selectByExample(SdaMzBumonExample example);

    SdaMzBumon selectByPrimaryKey(String sdaBumoncd);

    List<HashMap> selectByExample2(SdaMzBumonExample example);

    HashMap selectByPrimaryKey2(String sdaBumoncd);

    int updateByExampleSelective(@Param("record") SdaMzBumon record, @Param("example") SdaMzBumonExample example);

    int updateByExample(@Param("record") SdaMzBumon record, @Param("example") SdaMzBumonExample example);

    int updateByPrimaryKeySelective(SdaMzBumon record);

    int updateByPrimaryKey(SdaMzBumon record);
}