package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class CreateDatingShotInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = false,hidden=false, value = "用户ID")
    private Long userId;
    @ApiModelProperty(required = false,hidden=false, value = "用户昵称")
    private String userName;
    @ApiModelProperty(required = false,hidden=false, value = "用户头像")
    private String userImage;
    @ApiModelProperty(required = false,hidden=false, value = "约拍地点")
    private String datingShotAddress;
    @ApiModelProperty(required = false,hidden=false, value = "拍摄目的")
    private String purpose;
    @ApiModelProperty(required = false,hidden=false, value = "付款方式")
    private String paymentMethod;
    @ApiModelProperty(required = false,hidden=false, value = "说明")
    private String description;
    @ApiModelProperty(required = false,hidden=false, value = "约拍简介")
    private String datingShotIntroduction;
    @ApiModelProperty(required = false,hidden=false, value = "约拍照片,多张照片通过@分割")
    private String datingShotImages;


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

    public String getDatingShotAddress() {
        return datingShotAddress;
    }

    public void setDatingShotAddress(String datingShotAddress) {
        this.datingShotAddress = datingShotAddress == null ? null : datingShotAddress.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDatingShotIntroduction() {
        return datingShotIntroduction;
    }

    public void setDatingShotIntroduction(String datingShotIntroduction) {
        this.datingShotIntroduction = datingShotIntroduction == null ? null : datingShotIntroduction.trim();
    }

    public String getDatingShotImages() {
        return datingShotImages;
    }

    public void setDatingShotImages(String datingShotImages) {
        this.datingShotImages = datingShotImages == null ? null : datingShotImages.trim();
    }
}