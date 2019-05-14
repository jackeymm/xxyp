package com.xxyp.service;

import com.xxyp.model.DatingShot;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
public interface IDatingShotService {

    int insert(DatingShot datingShot);

    List<DatingShot> selectByExample(DatingShot datingShot);

    DatingShot selectByPrimaryKey(Long datingShotId);

    int updateByPrimaryKey(DatingShot datingShot);

}
