package com.xxyp.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.xxyp.dao.FansMapper;
import com.xxyp.model.Fans;
import com.xxyp.model.FansExample;
import com.xxyp.service.IFansService;
import com.xxyp.utils.GsonUtil;
import org.apache.ibatis.annotations.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by jackeymm on 2017/3/12.
 */

@Service("fansService")
public class FansServiceImpl implements IFansService {

    private static final Logger logger = LoggerFactory.getLogger(FansServiceImpl.class);

    @Autowired
    private FansMapper fansMapper;

    @Options(useGeneratedKeys=true, keyProperty="fansId", keyColumn="fans_id")
    public int insert(Fans record) {
        fansMapper.insert(record);
        return record.getFansId() == null ? 0 : record.getFansId().intValue();
    }


    public List<Fans> selectByExample(Fans fans) {
        FansExample example = new FansExample();
        FansExample.Criteria criteria = example.createCriteria();
        assemblyUserInfoEqual2Criteria(criteria, fans);
        logger.info("### example : "+GsonUtil.toJson(example));
        List<Fans> fansList = fansMapper.selectByExample(example);
        logger.info("### fansList : "+GsonUtil.toJson(fansList));

        if(CollectionUtils.isEmpty(fansList)){
            return Lists.newArrayList();
        }

        Set<Long> fromList = Sets.newHashSet();
        Set<Long> toList = Sets.newHashSet();
        for(int i = 0; i < fansList.size(); i++){
            Fans tempFans = fansList.get(i);
            fromList.add(tempFans.getFromUserId());
            toList.add(tempFans.getToUserId());
            tempFans.setRelationStatus(0);
            fansList.set(i,tempFans);
        }
        logger.info("### fansList : "+GsonUtil.toJson(fansList));
        logger.info("### fromList : "+GsonUtil.toJson(fromList));
        logger.info("### toList : "+GsonUtil.toJson(toList));

        FansExample fromExample = new FansExample();
        FansExample.Criteria fromCriteria = fromExample.createCriteria();
        assemblyFansbyFromUserId(fromCriteria, fromList);
        logger.info("### example : "+GsonUtil.toJson(fromExample));
        List<Fans> fromFansList = fansMapper.selectByExample(fromExample);
        logger.info("### fromFansList : "+GsonUtil.toJson(fromFansList));
        for(int i = 0; i < fromFansList.size(); i++){
            Fans tempFans = fromFansList.get(i);
            if(toList.add(tempFans.getToUserId().longValue())){
                for(int j = 0; j < fansList.size(); j++){
                    Fans fansResult = fansList.get(j);
                    if(tempFans.getToUserId().longValue() == fansResult.getFromUserId().longValue()
                            && tempFans.getFromUserId().longValue() == fansResult.getToUserId().longValue()){
                        fansResult.setRelationStatus(1);
                        fansList.set(j,fansResult);
                    }
                }
            }
        }

        FansExample toExample = new FansExample();
        FansExample.Criteria toCriteria = toExample.createCriteria();
        assemblyFansbyToUserId(toCriteria, toList);
        logger.info("### example : "+GsonUtil.toJson(toExample));
        List<Fans> toFansList = fansMapper.selectByExample(toExample);
        logger.info("### fromFansList : "+GsonUtil.toJson(fromFansList));
        for(int i = 0; i < toFansList.size(); i++){
            Fans tempFans = toFansList.get(i);
            if(fromList.add(tempFans.getFromUserId().longValue())){
                for(int j = 0; j < fansList.size(); j++){
                    Fans fansResult = fansList.get(j);
                    if(tempFans.getToUserId().longValue() == fansResult.getFromUserId().longValue()
                            && tempFans.getFromUserId().longValue() == fansResult.getToUserId().longValue()){
                        fansResult.setRelationStatus(1);
                        fansList.set(j,fansResult);
                    }
                }
            }
            }

        return fansList;
    }

    public int selectFansCountByExample(Fans fans) {
        FansExample example = new FansExample();
        FansExample.Criteria criteria = example.createCriteria();
        assemblyUserInfoEqual2Criteria(criteria, fans);
        logger.info("### example : "+GsonUtil.toJson(example));
        List<Fans> fansList = fansMapper.selectByExample(example);
        return fansList.size();
    }

    public int updateByUsers(Fans fans){
        return fansMapper.updateByUsers(fans);
    }


    public int deleteFans(Fans record) {
        return fansMapper.deleteFans(record);
    }


    private void assemblyUserInfoEqual2Criteria(FansExample.Criteria criteria, Fans fans){
        logger.info("assemblyUserInfoEqual2Criteria -- userInfo : "+GsonUtil.toJson(fans));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(fans.getFromUserId())){
            criteria.andFromUserIdEqualTo(fans.getFromUserId());
        }
        if(!StringUtils.isEmpty(fans.getToUserId())){
            criteria.andToUserIdEqualTo(fans.getToUserId());
        }
        if(!StringUtils.isEmpty(fans.getStatus())){
            criteria.andStatusEqualTo(fans.getStatus());
        }else{
            criteria.andStatusEqualTo(1);
        }
        logger.info("### example : "+GsonUtil.toJson(criteria));

    }

    private void assemblyFansbyFromUserId(FansExample.Criteria criteria,Set set){
        criteria.andFromUserIdIn(new ArrayList<Long>(set));
        logger.info("### example : "+GsonUtil.toJson(criteria));
    }

    private void assemblyFansbyToUserId(FansExample.Criteria criteria,Set set){
        criteria.andToUserIdIn(new ArrayList<Long>(set));
        logger.info("### example : "+GsonUtil.toJson(criteria));
    }
}
