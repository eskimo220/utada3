package com.heroku.mapper;

import com.heroku.entity.Ticks;
import com.heroku.entity.TicksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicksMapper {
    int countByExample(TicksExample example);

    int deleteByExample(TicksExample example);

    int insert(Ticks record);

    int insertSelective(Ticks record);

    List<Ticks> selectByExample(TicksExample example);

    int updateByExampleSelective(@Param("record") Ticks record, @Param("example") TicksExample example);

    int updateByExample(@Param("record") Ticks record, @Param("example") TicksExample example);
}