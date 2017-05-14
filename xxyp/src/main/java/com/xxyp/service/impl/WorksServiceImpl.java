package com.xxyp.service.impl;

import com.xxyp.dao.WorksMapper;
import com.xxyp.model.Works;
import com.xxyp.model.WorksExample;
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
@Service("worksService")
public class WorksServiceImpl implements IWorksService {

    private static final Logger logger = LoggerFactory.getLogger(WorksServiceImpl.class);

    @Autowired
    private WorksMapper worksMapper;

    public int countByExample(WorksExample example){
        return worksMapper.countByExample(example);
    }

    public int deleteByExample(WorksExample example){
        return worksMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Long worksId){
        return worksMapper.deleteByPrimaryKey(worksId);
    }

    public int insert(Works record){
        return worksMapper.insert(record);
    }

    public int insertSelective(Works record){
        return worksMapper.insertSelective(record);
    }

    public List<Works> selectByExample(Works works){
        WorksExample example = new WorksExample();
        WorksExample.Criteria criteria = example.createCriteria();
        assemblyWorksEqual2Criteria(criteria, works);
        logger.info("### example : "+ GsonUtil.toJson(example));
        return worksMapper.selectByExample(example);
    }

    public Works selectByPrimaryKey(Long worksId){
        return worksMapper.selectByPrimaryKey(worksId);
    }

    public int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example){
        return worksMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") Works record, @Param("example") WorksExample example){
        return worksMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(Works record){
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Works record){
        return worksMapper.updateByPrimaryKey(record);
    }

    private void assemblyWorksEqual2Criteria(WorksExample.Criteria criteria, Works works){
        logger.info("assemblyWorksEqual2Criteria -- works : "+GsonUtil.toJson(works));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(works.getReleaseTime()))
            criteria.andReleaseTimeEqualTo(works.getReleaseTime());
        if(!StringUtils.isEmpty(works.getStatus()))
            criteria.andStatusEqualTo(works.getStatus());
        if(!StringUtils.isEmpty(works.getUserImage()))
            criteria.andUserImageEqualTo(works.getUserImage());
        if(!StringUtils.isEmpty(works.getUserId()))
            criteria.andUserIdEqualTo(works.getUserId());
        if(!StringUtils.isEmpty(works.getUserName()))
            criteria.andUserNameEqualTo(works.getUserName());
        if(!StringUtils.isEmpty(works.getWorksTitle()))
            criteria.andWorksTitleEqualTo(works.getWorksTitle());
        if(!StringUtils.isEmpty(works.getWorksAddress()))
            criteria.andWorksIntroductionEqualTo(works.getWorksIntroduction());
        if(!StringUtils.isEmpty(works.getWorksId()))
            criteria.andWorksIdEqualTo(works.getWorksId());
    }

}
