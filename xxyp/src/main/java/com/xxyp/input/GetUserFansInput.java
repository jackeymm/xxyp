package com.xxyp.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class GetUserFansInput implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(required = true,  value = "我的用户Id")
    private Long myUserId;
    @ApiModelProperty(required = true,  value = "其他人的userId")
    private Long otherUserId;

    public Long getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(Long myUserId) {
        this.myUserId = myUserId;
    }

    public Long getOtherUserId() {
        return otherUserId;
    }

    public void setOtherUserId(Long otherUserId) {
        this.otherUserId = otherUserId;
    }
}
