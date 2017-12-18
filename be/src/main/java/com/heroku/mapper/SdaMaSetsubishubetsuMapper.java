package com.heroku.mapper;

import com.heroku.entity.SdaMaSetsubishubetsu;
import com.heroku.entity.SdaMaSetsubishubetsuExample;
import com.heroku.entity.SdaMaSetsubishubetsuKey;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdaMaSetsubishubetsuMapper {
    int countByExample(SdaMaSetsubishubetsuExample example);

    int deleteByExample(SdaMaSetsubishubetsuExample example);

    int deleteByPrimaryKey(SdaMaSetsubishubetsuKey key);

    int insert(SdaMaSetsubishubetsu record);

    int insertSelective(SdaMaSetsubishubetsu record);

    List<SdaMaSetsubishubetsu> selectByExample(SdaMaSetsubishubetsuExample example);

    SdaMaSetsubishubetsu selectByPrimaryKey(SdaMaSetsubishubetsuKey key);

    List<HashMap> selectByExample2(SdaMaSetsubishubetsuExample example);

    HashMap selectByPrimaryKey2(SdaMaSetsubishubetsuKey key);

    int updateByExampleSelective(@Param("record") SdaMaSetsubishubetsu record, @Param("example") SdaMaSetsubishubetsuExample example);

    int updateByExample(@Param("record") SdaMaSetsubishubetsu record, @Param("example") SdaMaSetsubishubetsuExample example);

    int updateByPrimaryKeySelective(SdaMaSetsubishubetsu record);

    int updateByPrimaryKey(SdaMaSetsubishubetsu record);
}