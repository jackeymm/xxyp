package com.xxyp.dao;

import com.xxyp.model.DatingShotPhoto;
import com.xxyp.model.DatingShotPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatingShotPhotoMapper {
    int countByExample(DatingShotPhotoExample example);

    int deleteByExample(DatingShotPhotoExample example);

    int deleteByPrimaryKey(Long datingShotPhotoId);

    int insert(DatingShotPhoto record);

    int insertSelective(DatingShotPhoto record);

    List<DatingShotPhoto> selectByExample(DatingShotPhotoExample example);

    DatingShotPhoto selectByPrimaryKey(Long datingShotPhotoId);

    int updateByExampleSelective(@Param("record") DatingShotPhoto record, @Param("example") DatingShotPhotoExample example);

    int updateByExample(@Param("record") DatingShotPhoto record, @Param("example") DatingShotPhotoExample example);

    int updateByPrimaryKeySelective(DatingShotPhoto record);

    int updateByPrimaryKey(DatingShotPhoto record);
}