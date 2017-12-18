package com.heroku.mapper;

import com.heroku.entity.SdaMaShisetsumei;
import com.heroku.entity.SdaMaShisetsumeiExample;
import com.heroku.entity.SdaMaShisetsumeiKey;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMaShisetsumeiMapper {
    int countByExample(SdaMaShisetsumeiExample example);

    int deleteByExample(SdaMaShisetsumeiExample example);

    int deleteByPrimaryKey(SdaMaShisetsumeiKey key);

    int insert(SdaMaShisetsumei record);

    int insertSelective(SdaMaShisetsumei record);

    List<SdaMaShisetsumei> selectByExample(SdaMaShisetsumeiExample example);

    SdaMaShisetsumei selectByPrimaryKey(SdaMaShisetsumeiKey key);

    List<HashMap> selectByExample2(SdaMaShisetsumeiExample example);

    HashMap selectByPrimaryKey2(SdaMaShisetsumeiKey key);

    int updateByExampleSelective(@Param("record") SdaMaShisetsumei record, @Param("example") SdaMaShisetsumeiExample example);

    int updateByExample(@Param("record") SdaMaShisetsumei record, @Param("example") SdaMaShisetsumeiExample example);

    int updateByPrimaryKeySelective(SdaMaShisetsumei record);

    int updateByPrimaryKey(SdaMaShisetsumei record);
}