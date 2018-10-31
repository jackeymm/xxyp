package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by jackeymm on 2017/6/19.
 */
public class CreateWorksPhotoInput implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(required = false,hidden=false, value = "作品照片")
    private String worksPhoto;
    @ApiModelProperty(required = false,hidden=false, value = "作品照片位置")
    private Integer worksImageOrder;


    public String getWorksPhoto() {
        return worksPhoto;
    }

    public void setWorksPhoto(String worksPhoto) {
        this.worksPhoto = worksPhoto;
    }

    public Integer getWorksImageOrder() {
        return worksImageOrder;
    }

    public void setWorksImageOrder(Integer worksImageOrder) {
        this.worksImageOrder = worksImageOrder;
    }
}
