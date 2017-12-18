package com.heroku.mapper;

import com.heroku.entity.Fortest;
import com.heroku.entity.FortestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FortestMapper {
    int countByExample(FortestExample example);

    int deleteByExample(FortestExample example);

    int insert(Fortest record);

    int insertSelective(Fortest record);

    List<Fortest> selectByExample(FortestExample example);

    int updateByExampleSelective(@Param("record") Fortest record, @Param("example") FortestExample example);

    int updateByExample(@Param("record") Fortest record, @Param("example") FortestExample example);
}