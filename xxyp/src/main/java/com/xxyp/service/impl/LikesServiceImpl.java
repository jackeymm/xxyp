package com.xxyp.service.impl;

import com.xxyp.dao.LikesMapper;
import com.xxyp.dao.WorksMapper;
import com.xxyp.model.*;
import com.xxyp.service.ILikesService;
import com.xxyp.service.IWorksService;
import com.xxyp.utils.GsonUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
@Service("LikesService")
public class LikesServiceImpl implements ILikesService {

    private static final Logger logger = LoggerFactory.getLogger(LikesServiceImpl.class);

    @Autowired
    private LikesMapper likesMapper;


    public int insert(Likes record){
        return likesMapper.insert(record);
    }


    public List<Likes> selectByExample(Likes likes){
        LikesExample example = new LikesExample();
        LikesExample.Criteria criteria = example.createCriteria();
        assemblyLikesEqual2Criteria(criteria, likes);
        logger.info("### example : "+ GsonUtil.toJson(example));
        return likesMapper.selectByExample(example);
    }


    public int updateByPrimaryKey(Likes record){
        return likesMapper.updateByPrimaryKey(record);
    }

    private void assemblyLikesEqual2Criteria(LikesExample.Criteria criteria, Likes likes){
        logger.info("assemblyWorksEqual2Criteria -- works : "+GsonUtil.toJson(likes));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(likes.getWorkId()))
            criteria.andWorkIdEqualTo(likes.getWorkId());
        if(!StringUtils.isEmpty(likes.getWorkType()))
            criteria.andWorkTypeEqualTo(likes.getWorkType());
        if(!StringUtils.isEmpty(likes.getLikeUserId()))
            criteria.andLikeUserIdEqualTo(likes.getLikeUserId());
    }

}
