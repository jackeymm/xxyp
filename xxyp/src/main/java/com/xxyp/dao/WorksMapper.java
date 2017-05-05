package com.xxyp.dao;

import com.xxyp.model.Works;
import com.xxyp.model.WorksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksMapper {
    int countByExample(WorksExample example);

    int deleteByExample(WorksExample example);

    int deleteByPrimaryKey(Long worksId);

    int insert(Works record);

    int insertSelective(Works record);

    List<Works> selectByExample(WorksExample example);

    Works selectByPrimaryKey(Long worksId);

    int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByExample(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}