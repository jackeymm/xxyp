package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UpdateFansInput implements Serializable{
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(required = true,hidden=false, value = "用户Id")
    private Long fromUserId;

    @ApiModelProperty(required = true,hidden=false, value = "关注用户Id")
    private Long toUserId;


    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
}