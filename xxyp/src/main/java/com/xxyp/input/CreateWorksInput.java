package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jackeymm on 2017/6/19.
 */
public class CreateWorksInput implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = false,hidden=false, value = "用户ID")
    private Long userId;
    @ApiModelProperty(required = false,hidden=false, value = "作品地点")
    private String worksAddress;
    @ApiModelProperty(required = false,hidden=false, value = "作品标题")
    private String worksTitle;
    @ApiModelProperty(required = false,hidden=false, value = "作品简介")
    private String worksIntroduction;
    @ApiModelProperty(required = false,hidden=false, value = "作品照片列表")
    private List<CreateWorksPhotoInput> list;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWorksAddress() {
        return worksAddress;
    }

    public void setWorksAddress(String worksAddress) {
        this.worksAddress = worksAddress;
    }

    public String getWorksTitle() {
        return worksTitle;
    }

    public void setWorksTitle(String worksTitle) {
        this.worksTitle = worksTitle;
    }

    public String getWorksIntroduction() {
        return worksIntroduction;
    }

    public void setWorksIntroduction(String worksIntroduction) {
        this.worksIntroduction = worksIntroduction;
    }

    public List<CreateWorksPhotoInput> getList() {
        return list;
    }

    public void setList(List<CreateWorksPhotoInput> list) {
        this.list = list;
    }
}
