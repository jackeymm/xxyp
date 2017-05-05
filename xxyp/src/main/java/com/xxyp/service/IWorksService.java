package com.xxyp.service;

import com.xxyp.model.Works;
import com.xxyp.model.WorksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
public interface IWorksService {
    int countByExample(WorksExample example);

    int deleteByExample(WorksExample example);

    int deleteByPrimaryKey(Long worksId);

    int insert(Works record);

    int insertSelective(Works record);

    List<Works> selectByExample(Works works);

    Works selectByPrimaryKey(Long worksId);

    int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByExample(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}
