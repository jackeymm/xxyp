package com.xxyp.dao;

import com.xxyp.model.DatingShot;
import com.xxyp.model.DatingShotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatingShotMapper {
    int countByExample(DatingShotExample example);

    int deleteByExample(DatingShotExample example);

    int deleteByPrimaryKey(Long datingShotId);

    int insert(DatingShot record);

    int insertSelective(DatingShot record);

    List<DatingShot> selectByExample(DatingShotExample example);

    DatingShot selectByPrimaryKey(Long datingShotId);

    int updateByExampleSelective(@Param("record") DatingShot record, @Param("example") DatingShotExample example);

    int updateByExample(@Param("record") DatingShot record, @Param("example") DatingShotExample example);

    int updateByPrimaryKeySelective(DatingShot record);

    int updateByPrimaryKey(DatingShot record);
}