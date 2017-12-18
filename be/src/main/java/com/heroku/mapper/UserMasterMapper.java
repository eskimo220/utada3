package com.heroku.mapper;

import com.heroku.entity.UserMaster;
import com.heroku.entity.UserMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMasterMapper {
    int countByExample(UserMasterExample example);

    int deleteByExample(UserMasterExample example);

    int deleteByPrimaryKey(String username);

    int insert(UserMaster record);

    int insertSelective(UserMaster record);

    List<UserMaster> selectByExample(UserMasterExample example);

    UserMaster selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") UserMaster record, @Param("example") UserMasterExample example);

    int updateByExample(@Param("record") UserMaster record, @Param("example") UserMasterExample example);

    int updateByPrimaryKeySelective(UserMaster record);

    int updateByPrimaryKey(UserMaster record);
}