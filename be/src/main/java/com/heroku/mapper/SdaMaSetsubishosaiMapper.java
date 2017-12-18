package com.heroku.mapper;

import com.heroku.entity.SdaMaSetsubishosai;
import com.heroku.entity.SdaMaSetsubishosaiExample;
import com.heroku.entity.SdaMaSetsubishosaiKey;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMaSetsubishosaiMapper {
    int countByExample(SdaMaSetsubishosaiExample example);

    int deleteByExample(SdaMaSetsubishosaiExample example);

    int deleteByPrimaryKey(SdaMaSetsubishosaiKey key);

    int insert(SdaMaSetsubishosai record);

    int insertSelective(SdaMaSetsubishosai record);

    List<SdaMaSetsubishosai> selectByExample(SdaMaSetsubishosaiExample example);

    SdaMaSetsubishosai selectByPrimaryKey(SdaMaSetsubishosaiKey key);

    List<HashMap> selectByExample2(SdaMaSetsubishosaiExample example);

    HashMap selectByPrimaryKey2(SdaMaSetsubishosaiKey key);

    int updateByExampleSelective(@Param("record") SdaMaSetsubishosai record, @Param("example") SdaMaSetsubishosaiExample example);

    int updateByExample(@Param("record") SdaMaSetsubishosai record, @Param("example") SdaMaSetsubishosaiExample example);

    int updateByPrimaryKeySelective(SdaMaSetsubishosai record);

    int updateByPrimaryKey(SdaMaSetsubishosai record);
}