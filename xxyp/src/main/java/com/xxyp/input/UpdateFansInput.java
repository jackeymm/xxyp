package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UpdateFansInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true,hidden=false, value = "关注ID")
    private Long fansId;

    public Long getFansId() {
        return fansId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }
}