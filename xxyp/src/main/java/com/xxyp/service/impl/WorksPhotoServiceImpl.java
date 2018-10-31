package com.xxyp.service.impl;

import com.xxyp.dao.WorksPhotoMapper;
import com.xxyp.model.*;
import com.xxyp.service.IWorksPhotoService;
import com.xxyp.utils.GsonUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/8.
 */
@Service("worksPhotoServicd")
public class WorksPhotoServiceImpl implements IWorksPhotoService{

    private static final Logger logger = LoggerFactory.getLogger(WorksServiceImpl.class);

    @Autowired
    private WorksPhotoMapper worksPhotoMapper;

    public int insert(WorksPhoto record) {
        return worksPhotoMapper.insert(record);
    }

    public List<WorksPhoto> selectByExample(WorksPhoto worksPhoto) {
        WorksPhotoExample example = new WorksPhotoExample();
        WorksPhotoExample.Criteria criteria = example.createCriteria();
        assemblyWorksPhotoEqual2Criteria(criteria, worksPhoto);
        logger.info("### example : "+ GsonUtil.toJson(example));
        return worksPhotoMapper.selectByExample(example);
    }

    public List<WorksPhoto> getHotWorks() {
        WorksPhotoExample example = new WorksPhotoExample();
//        WorksPhotoExample.Criteria criteria = example.createCriteria();
//        assemblyHotWorksPhotoEqual2Criteria(criteria, worksPhoto);
        example.setOrderByClause("works_image_like_count");

        logger.info("### getHotWorks example : "+ GsonUtil.toJson(example));
        return worksPhotoMapper.getHotWorks(example);
    }

    public int updateByPrimaryKey(WorksPhoto record) {
        return worksPhotoMapper.updateByPrimaryKey(record);
    }


    private void assemblyWorksPhotoEqual2Criteria(WorksPhotoExample.Criteria criteria, WorksPhoto worksPhoto){
        logger.info("assemblyWorksEqual2Criteria -- works : "+GsonUtil.toJson(worksPhoto));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(worksPhoto.getStatus()))
            criteria.andStatusEqualTo(worksPhoto.getStatus());
        if(!StringUtils.isEmpty(worksPhoto.getWorksId()))
            criteria.andWorksIdEqualTo(worksPhoto.getWorksId());
        if(!StringUtils.isEmpty(worksPhoto.getWorksPhotoId()))
            criteria.andWorksPhotoIdEqualTo(worksPhoto.getWorksPhotoId());
    }

    private void assemblyHotWorksPhotoEqual2Criteria(WorksPhotoExample.Criteria criteria, WorksPhoto worksPhoto){

    }

}
