package com.xxyp.service.impl;

import com.xxyp.dao.UserInfoMapper;
import com.xxyp.model.UserInfo;
import com.xxyp.model.UserInfoExample;
import com.xxyp.service.IUserInfoService;
import com.xxyp.utils.GsonUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by jackeymm on 2017/3/12.
 */

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    public int countByExample(UserInfoExample example) {
        return userInfoMapper.countByExample(example);
    }

    public int deleteByExample(UserInfoExample example) {
        return userInfoMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Long userId) {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    public List<UserInfo> selectByExample(UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        assemblyUserInfoEqual2Criteria(criteria, userInfo);
        logger.info("### example : "+GsonUtil.toJson(example));
        return userInfoMapper.selectByExample(example);
    }

    public UserInfo selectByPrimaryKey(Long userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    public int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example) {
        return userInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example) {
        return userInfoMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }


    private void assemblyUserInfoEqual2Criteria(UserInfoExample.Criteria criteria, UserInfo userInfo){
        logger.info("assemblyUserInfoEqual2Criteria -- userInfo : "+GsonUtil.toJson(userInfo));
        logger.info("### example : "+GsonUtil.toJson(criteria));
        if(!StringUtils.isEmpty(userInfo.getUserId())){
            criteria.andUserIdEqualTo(userInfo.getUserId());
        }
        if(!StringUtils.isEmpty(userInfo.getEmail())){
            criteria.andEmailEqualTo(userInfo.getEmail());
        }
        if(!StringUtils.isEmpty(userInfo.getMobile())){
            criteria.andMobileEqualTo(userInfo.getMobile());
        }
        if(!StringUtils.isEmpty(userInfo.getStatus())){
            criteria.andStatusEqualTo(userInfo.getStatus());
        }
        if(!StringUtils.isEmpty(userInfo.getUserIdentity())){
            criteria.andUserIdentityEqualTo(userInfo.getUserIdentity());
        }
        if(!StringUtils.isEmpty(userInfo.getUserName())){
            criteria.andUserNameEqualTo(userInfo.getUserName());
        }
        if(!StringUtils.isEmpty(userInfo.getUserSourceId())){
            criteria.andUserSourceIdEqualTo(userInfo.getUserSourceId());
        }
        if(!StringUtils.isEmpty(userInfo.getUserSource())){
            criteria.andUserSourceEqualTo(userInfo.getUserSource());
        }
        if(!StringUtils.isEmpty(userInfo.getGender())){
            criteria.andUserGenderEqualTo(userInfo.getGender());
        }
        logger.info("### example : "+GsonUtil.toJson(criteria));

    }
}
