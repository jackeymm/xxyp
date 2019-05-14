package com.xxyp.model;

import java.util.List;

public class Works extends PageEntity{
    private Long worksId;

    private Long userId;

    private String userName;

    private String userImage;

    private String worksAddress;

    private Long releaseTime;

    private Integer status;

    private String worksTitle;

    private String worksIntroduction;

    private List<WorksPhoto> list;

    public Long getWorksId() {
        return worksId;
    }

    public void setWorksId(Long worksId) {
        this.worksId = worksId;
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

    public String getWorksAddress() {
        return worksAddress;
    }

    public void setWorksAddress(String worksAddress) {
        this.worksAddress = worksAddress == null ? null : worksAddress.trim();
    }

    public Long getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWorksTitle() {
        return worksTitle;
    }

    public void setWorksTitle(String worksTitle) {
        this.worksTitle = worksTitle == null ? null : worksTitle.trim();
    }

    public String getWorksIntroduction() {
        return worksIntroduction;
    }

    public void setWorksIntroduction(String worksIntroduction) {
        this.worksIntroduction = worksIntroduction == null ? null : worksIntroduction.trim();
    }

    public List<WorksPhoto> getList() {
        return list;
    }

    public void setList(List<WorksPhoto> list) {
        this.list = list;
    }
}