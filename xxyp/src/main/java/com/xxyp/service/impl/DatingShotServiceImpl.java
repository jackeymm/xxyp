package com.xxyp.service.impl;

import com.xxyp.dao.DatingShotMapper;
import com.xxyp.dao.WorksMapper;
import com.xxyp.model.DatingShot;
import com.xxyp.model.DatingShotExample;
import com.xxyp.model.Works;
import com.xxyp.model.WorksExample;
import com.xxyp.service.IDatingShotService;
import com.xxyp.service.IWorksService;
import com.xxyp.utils.GsonUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
@Service("datingShotService")
public class DatingShotServiceImpl implements IDatingShotService {

    private static final Logger logger = LoggerFactory.getLogger(DatingShotServiceImpl.class);

    @Autowired
    private DatingShotMapper datingShotMapper;

    public int insert(DatingShot record){
        return datingShotMapper.insert(record);
    }


    public List<DatingShot> selectByExample(DatingShot datingShot){
        DatingShotExample example = new DatingShotExample();
        DatingShotExample.Criteria criteria = example.createCriteria();
        assemblyDatingShotEqual2Criteria(criteria, datingShot);
        logger.info("### example : "+ GsonUtil.toJson(example));
        return datingShotMapper.selectByExample(example);
    }


    public int updateByPrimaryKey(DatingShot record){
        return datingShotMapper.updateByPrimaryKey(record);
    }

    private void assemblyDatingShotEqual2Criteria(DatingShotExample.Criteria criteria, DatingShot datingShot){
        logger.info("assemblyWorksEqual2Criteria -- datingShot : "+GsonUtil.toJson(datingShot));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(datingShot.getReleaseTime()))
            criteria.andReleaseTimeEqualTo(datingShot.getReleaseTime());
        if(!StringUtils.isEmpty(datingShot.getStatus()))
            criteria.andStatusEqualTo(datingShot.getStatus());
        if(!StringUtils.isEmpty(datingShot.getUserImage()))
            criteria.andUserImageEqualTo(datingShot.getUserImage());
        if(!StringUtils.isEmpty(datingShot.getUserId()))
            criteria.andUserIdEqualTo(datingShot.getUserId());
        if(!StringUtils.isEmpty(datingShot.getUserName()))
            criteria.andUserNameEqualTo(datingShot.getUserName());
        if(!StringUtils.isEmpty(datingShot.getDatingShotIntroduction()))
            criteria.andDatingShotIntroductionEqualTo(datingShot.getDatingShotIntroduction());
        if(!StringUtils.isEmpty(datingShot.getDatingShotAddress()))
            criteria.andDatingShotAddressEqualTo(datingShot.getDatingShotAddress());
        if(!StringUtils.isEmpty(datingShot.getDatingShotId()))
            criteria.andDatingShotIdEqualTo(datingShot.getDatingShotId());
    }

}
