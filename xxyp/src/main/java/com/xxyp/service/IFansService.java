package com.xxyp.service;

import com.xxyp.model.Fans;

import java.util.List;

/**
 * Created by jackeymm on 2017-08-29
 */
public interface IFansService {

    int insert(Fans record);

    List<Fans> selectByExample(Fans fans);

    int selectFansCountByExample(Fans fans);

    int updateByPrimaryKey(Fans record);
}
