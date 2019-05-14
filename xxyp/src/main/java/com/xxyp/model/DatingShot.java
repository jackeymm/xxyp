package com.xxyp.model;

import java.util.List;

public class DatingShot extends PageEntity{
    private Long datingShotId;

    private Long userId;

    private String userName;

    private String userImage;

    private String datingShotAddress;

    private Long releaseTime;

    private String purpose;

    private String paymentMethod;

    private String description;

    private Integer status;

    private String datingShotIntroduction;

    private List<DatingShotPhoto> datingShotImages;

    private Long datingUserId;

    public Long getDatingShotId() {
        return datingShotId;
    }

    public void setDatingShotId(Long datingShotId) {
        this.datingShotId = datingShotId;
    }

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

    public Long getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDatingShotIntroduction() {
        return datingShotIntroduction;
    }

    public void setDatingShotIntroduction(String datingShotIntroduction) {
        this.datingShotIntroduction = datingShotIntroduction == null ? null : datingShotIntroduction.trim();
    }

    public List<DatingShotPhoto>  getDatingShotImages() {
        return datingShotImages;
    }

    public void setDatingShotImages(List<DatingShotPhoto> datingShotImages) {
        this.datingShotImages = datingShotImages;
    }

    public Long getDatingUserId() {
        return datingUserId;
    }

    public void setDatingUserId(Long datingUserId) {
        this.datingUserId = datingUserId;
    }
}