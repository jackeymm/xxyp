package com.xxyp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserInfo implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(required = false,hidden=true, value = "用户Id")
    private Long userId;
    @ApiModelProperty(required = true,hidden=false, value = "用户昵称")
    private String userName;
    @ApiModelProperty(required = true,hidden=false, value = "用户头像")
    private String userImage;
    @ApiModelProperty(required = true,hidden=false, value = "用户简介")
    private String userIntroduction;
    @ApiModelProperty(required = true,hidden=false, value = "用户身份（1约拍者，2摄影师）")
    private Integer userIdentity;
    @ApiModelProperty(required = true,hidden=false, value = "用户来源（1微信，2微博）")
    private Integer userSource;
    @ApiModelProperty(required = true,hidden=false, value = "用户来源uid")
    private Long userSourceId;
    @ApiModelProperty(required = true,hidden=false, value = "手机号")
    private String mobile;
    @ApiModelProperty(required = true,hidden=false, value = "邮箱")
    private String email;
    @ApiModelProperty(required = true,hidden=true, value = "用户状态")
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction == null ? null : userIntroduction.trim();
    }

    public Integer getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Integer getUserSource() {
        return userSource;
    }

    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    public Long getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(Long userSourceId) {
        this.userSourceId = userSourceId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}