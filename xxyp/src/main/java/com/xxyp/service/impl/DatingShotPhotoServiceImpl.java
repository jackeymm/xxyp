package com.xxyp.service.impl;

import com.xxyp.dao.DatingShotPhotoMapper;
import com.xxyp.model.DatingShotPhoto;
import com.xxyp.model.DatingShotPhotoExample;
import com.xxyp.service.IDatingShotPhotoService;
import com.xxyp.utils.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
@Service("datingShotPhotoService")
public class DatingShotPhotoServiceImpl implements IDatingShotPhotoService {

    private static final Logger logger = LoggerFactory.getLogger(DatingShotPhotoServiceImpl.class);

    @Autowired
    private DatingShotPhotoMapper datingShotPhotoMapper;

    public int insert(DatingShotPhoto record){
        return datingShotPhotoMapper.insert(record);
    }


    public List<DatingShotPhoto> selectByExample(DatingShotPhoto datingShotPhoto){
        DatingShotPhotoExample example = new DatingShotPhotoExample();
        DatingShotPhotoExample.Criteria criteria = example.createCriteria();
        assemblyDatingShotEqual2Criteria(criteria, datingShotPhoto);
        example.setOrderByClause("dating_shot_photo_id desc");
        logger.info("### example : "+ GsonUtil.toJson(example));
        return datingShotPhotoMapper.selectByExample(example);
    }


    public int updateByPrimaryKey(DatingShotPhoto record){
        return datingShotPhotoMapper.updateByPrimaryKey(record);
    }

    private void assemblyDatingShotEqual2Criteria(DatingShotPhotoExample.Criteria criteria, DatingShotPhoto datingShotPhoto){
        logger.info("assemblyWorksEqual2Criteria -- datingShot : "+GsonUtil.toJson(datingShotPhoto));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(datingShotPhoto.getStatus()))
            criteria.andStatusEqualTo(datingShotPhoto.getStatus());
        if(!StringUtils.isEmpty(datingShotPhoto.getDatingShotId()))
            criteria.andDatingShotIdEqualTo(datingShotPhoto.getDatingShotId());
        logger.info("### example : "+GsonUtil.toJson(criteria));
    }

}
