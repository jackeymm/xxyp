package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class CreateFansInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true,hidden=false, value = "发起关注的用户ID")
    private Long fromUserId;
    @ApiModelProperty(required = true,hidden=false, value = "被关注的用户ID")
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