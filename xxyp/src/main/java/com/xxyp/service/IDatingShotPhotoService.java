package com.xxyp.service;

import com.xxyp.model.DatingShotPhoto;

import java.util.List;

/**
 * Created by jackeymm on 2017/5/2.
 */
public interface IDatingShotPhotoService {

    int insert(DatingShotPhoto datingShotPhoto);

    List<DatingShotPhoto> selectByExample(DatingShotPhoto datingShotPhoto);

    int updateByPrimaryKey(DatingShotPhoto datingShotPhoto);
}
