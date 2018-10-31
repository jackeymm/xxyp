package com.xxyp.service;

import com.xxyp.model.Works;
import com.xxyp.model.WorksExample;
import com.xxyp.model.WorksPhoto;
import com.xxyp.model.WorksPhotoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
public interface IWorksPhotoService {


    int insert(WorksPhoto record);

    List<WorksPhoto> selectByExample(WorksPhoto worksPhoto);

    List<WorksPhoto> getHotWorks();

    int updateByPrimaryKey(WorksPhoto record);


}
