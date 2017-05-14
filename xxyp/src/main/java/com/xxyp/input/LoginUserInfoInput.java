package com.xxyp.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jackeymm on 2017/5/1.
 */
@ApiModel
public class LoginUserInfoInput implements java.io.Serializable {
        private static final long serialVersionUID = 1L;
        @ApiModelProperty(required = false,hidden=false, value = "用户昵称")
        private String userName;
        @ApiModelProperty(required = false,hidden=false, value = "用户来源（1微信，2微博）")
        private Integer userSource;
        @ApiModelProperty(required = false,hidden=false, value = "用户来源uid")
        private String userSourceId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getUserSource() {
        return userSource;
    }

    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    public String getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
    }
}
