package com.xxyp.model;

public class DatingShotPhoto extends PageEntity {
    private Long datingShotPhotoId;

    private Long datingShotId;

    private String datingShotPhoto;

    private Integer datingShotImageOrder;

    private Integer status;

    public Long getDatingShotPhotoId() {
        return datingShotPhotoId;
    }

    public void setDatingShotPhotoId(Long datingShotPhotoId) {
        this.datingShotPhotoId = datingShotPhotoId;
    }

    public Long getDatingShotId() {
        return datingShotId;
    }

    public void setDatingShotId(Long datingShotId) {
        this.datingShotId = datingShotId;
    }

    public String getDatingShotPhoto() {
        return datingShotPhoto;
    }

    public void setDatingShotPhoto(String datingShotPhoto) {
        this.datingShotPhoto = datingShotPhoto == null ? null : datingShotPhoto.trim();
    }

    public Integer getDatingShotImageOrder() {
        return datingShotImageOrder;
    }

    public void setDatingShotImageOrder(Integer datingShotImageOrder) {
        this.datingShotImageOrder = datingShotImageOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}