package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetDatingShotInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = false,hidden=false, value = "用户ID")
    private Long userId;
    @ApiModelProperty(required = false,hidden=false, value = "约拍ID")
    private Long datingShotId;
    @ApiModelProperty(required = false,hidden=false, value = "拍摄目的")
    private String purpose;
    @ApiModelProperty(required = false,hidden=false, value = "付款方式")
    private String paymentMethod;
    @ApiModelProperty(required = false,hidden=true, value = "说明")
    private String description;
    @ApiModelProperty(required = false,hidden=false, value = "约拍简介")
    private String datingShotIntroduction;
    @ApiModelProperty(required = false,hidden=false, value = "约拍用户ID")
    private Long datingUserId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Long getDatingShotId() {
        return datingShotId;
    }

    public void setDatingShotId(Long datingShotId) {
        this.datingShotId = datingShotId;
    }

    public Long getDatingUserId() {
        return datingUserId;
    }

    public void setDatingUserId(Long datingUserId) {
        this.datingUserId = datingUserId;
    }
}