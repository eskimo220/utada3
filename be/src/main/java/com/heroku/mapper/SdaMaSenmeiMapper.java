package com.heroku.mapper;

import com.heroku.entity.SdaMaSenmei;
import com.heroku.entity.SdaMaSenmeiExample;
import com.heroku.entity.SdaMaSenmeiKey;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMaSenmeiMapper {
    int countByExample(SdaMaSenmeiExample example);

    int deleteByExample(SdaMaSenmeiExample example);

    int deleteByPrimaryKey(SdaMaSenmeiKey key);

    int insert(SdaMaSenmei record);

    int insertSelective(SdaMaSenmei record);

    List<SdaMaSenmei> selectByExample(SdaMaSenmeiExample example);

    SdaMaSenmei selectByPrimaryKey(SdaMaSenmeiKey key);

    List<HashMap> selectByExample2(SdaMaSenmeiExample example);

    HashMap selectByPrimaryKey2(SdaMaSenmeiKey key);

    int updateByExampleSelective(@Param("record") SdaMaSenmei record, @Param("example") SdaMaSenmeiExample example);

    int updateByExample(@Param("record") SdaMaSenmei record, @Param("example") SdaMaSenmeiExample example);

    int updateByPrimaryKeySelective(SdaMaSenmei record);

    int updateByPrimaryKey(SdaMaSenmei record);
}