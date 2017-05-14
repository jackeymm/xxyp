package com.xxyp.model;

public class WorksPhoto {
    private Long worksPhotoId;

    private Long worksId;

    private String worksPhoto;

    private Integer worksImageOrder;

    private Long worksImageLikeCount;

    private Long worksImageCommentCount;

    private Integer status;

    public Long getWorksPhotoId() {
        return worksPhotoId;
    }

    public void setWorksPhotoId(Long worksPhotoId) {
        this.worksPhotoId = worksPhotoId;
    }

    public Long getWorksId() {
        return worksId;
    }

    public void setWorksId(Long worksId) {
        this.worksId = worksId;
    }

    public String getWorksPhoto() {
        return worksPhoto;
    }

    public void setWorksPhoto(String worksPhoto) {
        this.worksPhoto = worksPhoto == null ? null : worksPhoto.trim();
    }

    public Integer getWorksImageOrder() {
        return worksImageOrder;
    }

    public void setWorksImageOrder(Integer worksImageOrder) {
        this.worksImageOrder = worksImageOrder;
    }

    public Long getWorksImageLikeCount() {
        return worksImageLikeCount;
    }

    public void setWorksImageLikeCount(Long worksImageLikeCount) {
        this.worksImageLikeCount = worksImageLikeCount;
    }

    public Long getWorksImageCommentCount() {
        return worksImageCommentCount;
    }

    public void setWorksImageCommentCount(Long worksImageCommentCount) {
        this.worksImageCommentCount = worksImageCommentCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}