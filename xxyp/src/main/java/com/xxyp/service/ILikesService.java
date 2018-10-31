package com.xxyp.service;

import com.xxyp.model.Likes;
import com.xxyp.model.LikesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
public interface ILikesService {

    int insert(Likes record);

    List<Likes> selectByExample(Likes works);

    int updateByPrimaryKey(Likes record);
}
