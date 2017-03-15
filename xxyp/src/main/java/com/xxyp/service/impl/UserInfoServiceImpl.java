package com.xxyp.service.impl;

import com.xxyp.dao.UserInfoMapper;
import com.xxyp.model.UserInfo;
import com.xxyp.model.UserInfoExample;
import com.xxyp.service.IUserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackeymm on 2017/3/12.
 */

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

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

    public List<UserInfo> selectByExample(UserInfoExample example) {
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
}
