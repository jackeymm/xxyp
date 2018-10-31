package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

public class UpdateDatingShotInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = false,hidden=false, value = "约拍ID")
    private Long datingShotId;
    @ApiModelProperty(required = false,hidden=false, value = "状态")
    private Integer status;;
    @ApiModelProperty(required = false,hidden=false, value = "约拍地点")
    private String datingShotAddress;
    @ApiModelProperty(required = false,hidden=false, value = "拍摄目的")
    private String purpose;
    @ApiModelProperty(required = false,hidden=false, value = "付款方式")
    private String paymentMethod;
    @ApiModelProperty(required = false,hidden=true, value = "说明")
    private String description;
    @ApiModelProperty(required = false,hidden=false, value = "约拍简介")
    private String datingShotIntroduction;
    @ApiModelProperty(required = false,hidden=false, value = "约拍照片,list")
    private List<UpdateDatingShotPhotoInput> datingShotImages;
    @ApiModelProperty(required = false,hidden=false, value = "约拍用户ID")
    private Long datingUserId;


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

    public List<UpdateDatingShotPhotoInput> getDatingShotImages() {
        return datingShotImages;
    }

    public void setDatingShotImages(List<UpdateDatingShotPhotoInput> datingShotImages) {
        this.datingShotImages = datingShotImages;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDatingUserId() {
        return datingUserId;
    }

    public void setDatingUserId(Long datingUserId) {
        this.datingUserId = datingUserId;
    }

    public Long getDatingShotId() {
        return datingShotId;
    }

    public void setDatingShotId(Long datingShotId) {
        this.datingShotId = datingShotId;
    }
}