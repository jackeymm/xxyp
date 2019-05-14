package com.xxyp.dao;

import com.xxyp.model.Fans;
import com.xxyp.model.FansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FansMapper {
    int countByExample(FansExample example);

    int deleteByExample(FansExample example);

    int deleteByPrimaryKey(Long fansId);

    int insert(Fans record);

    int insertSelective(Fans record);

    List<Fans> selectByExample(FansExample example);

    Fans selectByPrimaryKey(Long fansId);

    int updateByExampleSelective(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByExample(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByPrimaryKeySelective(Fans record);

    int updateByPrimaryKey(Fans record);

    int updateByUsers(Fans record);

    int deleteFans(Fans record);

}