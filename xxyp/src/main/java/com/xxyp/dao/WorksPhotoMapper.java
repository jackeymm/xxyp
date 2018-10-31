package com.xxyp.dao;

import com.xxyp.model.WorksPhoto;
import com.xxyp.model.WorksPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksPhotoMapper {
    int countByExample(WorksPhotoExample example);

    int deleteByExample(WorksPhotoExample example);

    int deleteByPrimaryKey(Long worksPhotoId);

    int insert(WorksPhoto record);

    int insertSelective(WorksPhoto record);

    List<WorksPhoto> selectByExample(WorksPhotoExample example);


    List<WorksPhoto> getHotWorks(WorksPhotoExample example);

    WorksPhoto selectByPrimaryKey(Long worksPhotoId);

    int updateByExampleSelective(@Param("record") WorksPhoto record, @Param("example") WorksPhotoExample example);

    int updateByExample(@Param("record") WorksPhoto record, @Param("example") WorksPhotoExample example);

    int updateByPrimaryKeySelective(WorksPhoto record);

    int updateByPrimaryKey(WorksPhoto record);
}