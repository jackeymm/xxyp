package com.xxyp.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jackeymm on 2017/5/1.
 */
@ApiModel
public class CreateUserInfoInput implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(required = false,hidden=false, value = "用户昵称")
    private String userName;
    @ApiModelProperty(required = false,hidden=false, value = "用户头像")
    private String userImage;
    @ApiModelProperty(required = false,hidden=false, value = "用户简介")
    private String userIntroduction;
    @ApiModelProperty(required = false,hidden=false, value = "用户身份（1约拍者，2摄影师）")
    private Long userIdentity;
    @ApiModelProperty(required = false,hidden=false, value = "用户来源（1微信，2微博）")
    private Integer userSource;
    @ApiModelProperty(required = false,hidden=false, value = "用户来源uid")
    private String userSourceId;
    @ApiModelProperty(required = false,hidden=false, value = "手机号")
    private String mobile;
    @ApiModelProperty(required = false,hidden=false, value = "邮箱")
    private String email;
    @ApiModelProperty(required = false,hidden=false, value = "性别")
    private Integer gender;
    @ApiModelProperty(required = false,hidden=false, value = "地址")
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    public Long getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Long userIdentity) {
        this.userIdentity = userIdentity;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
