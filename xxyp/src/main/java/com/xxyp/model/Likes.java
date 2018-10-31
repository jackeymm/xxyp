package com.xxyp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Likes {
    @ApiModelProperty(required = false,hidden=false, value = "点赞Id")
    private Long likesId;
    @ApiModelProperty(required = false,hidden=false, value = "点赞者UserId")
    private Long likeUserId;
    @ApiModelProperty(required = false,hidden=false, value = "作品Id")
    private Long workId;
    @ApiModelProperty(required = false,hidden=true, value = "作品类型")
    private Byte workType;
    @ApiModelProperty(required = false,hidden=false, value = "粉丝Id")
    private Long fansId;
    @ApiModelProperty(required = false,hidden=false, value = "粉丝UserId")
    private Long fansFromUserId;
    @ApiModelProperty(required = false,hidden=false, value = "被粉丝UserId")
    private Long fansToUserId;

    public Long getLikesId() {
        return likesId;
    }

    public void setLikesId(Long likesId) {
        this.likesId = likesId;
    }

    public Long getLikeUserId() {
        return likeUserId;
    }

    public void setLikeUserId(Long likeUserId) {
        this.likeUserId = likeUserId;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Byte getWorkType() {
        return workType;
    }

    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    public Long getFansId() {
        return fansId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansFromUserId() {
        return fansFromUserId;
    }

    public void setFansFromUserId(Long fansFromUserId) {
        this.fansFromUserId = fansFromUserId;
    }

    public Long getFansToUserId() {
        return fansToUserId;
    }

    public void setFansToUserId(Long fansToUserId) {
        this.fansToUserId = fansToUserId;
    }
}