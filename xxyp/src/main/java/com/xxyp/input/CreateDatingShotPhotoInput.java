package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by jackeymm on 2017/6/19.
 */
public class CreateDatingShotPhotoInput implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(required = false,hidden=false, value = "作品照片")
    private String datingShotPhoto;
    @ApiModelProperty(required = false,hidden=false, value = "作品照片位置")
    private Integer datingShotImageOrder;


    public String getDatingShotPhoto() {
        return datingShotPhoto;
    }

    public void setDatingShotPhoto(String worksPhoto) {
        this.datingShotPhoto = worksPhoto;
    }

    public Integer getDatingShotImageOrder() {
        return datingShotImageOrder;
    }

    public void setDatingShotImageOrder(Integer worksImageOrder) {
        this.datingShotImageOrder = worksImageOrder;
    }
}
