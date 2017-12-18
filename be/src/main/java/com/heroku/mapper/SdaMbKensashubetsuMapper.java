package com.heroku.mapper;

import com.heroku.entity.SdaMbKensashubetsu;
import com.heroku.entity.SdaMbKensashubetsuExample;
import com.heroku.entity.SdaMbKensashubetsuKey;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SdaMbKensashubetsuMapper {
    int countByExample(SdaMbKensashubetsuExample example);

    int deleteByExample(SdaMbKensashubetsuExample example);

    int deleteByPrimaryKey(SdaMbKensashubetsuKey key);

    int insert(SdaMbKensashubetsu record);

    int insertSelective(SdaMbKensashubetsu record);

    List<SdaMbKensashubetsu> selectByExample(SdaMbKensashubetsuExample example);

    SdaMbKensashubetsu selectByPrimaryKey(SdaMbKensashubetsuKey key);

    List<HashMap> selectByExample2(SdaMbKensashubetsuExample example);

    HashMap selectByPrimaryKey2(SdaMbKensashubetsuKey key);

    int updateByExampleSelective(@Param("record") SdaMbKensashubetsu record, @Param("example") SdaMbKensashubetsuExample example);

    int updateByExample(@Param("record") SdaMbKensashubetsu record, @Param("example") SdaMbKensashubetsuExample example);

    int updateByPrimaryKeySelective(SdaMbKensashubetsu record);

    int updateByPrimaryKey(SdaMbKensashubetsu record);
}