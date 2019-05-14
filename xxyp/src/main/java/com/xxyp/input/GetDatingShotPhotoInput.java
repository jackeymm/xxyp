package com.xxyp.input;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetDatingShotPhotoInput implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true, value = "用户ID")
    private Long userId;

    @ApiModelProperty(required = false, value = "页大小，默认10条")
    private Integer pageSize = 10;

    @ApiModelProperty(required = false, value = "起始页数")
    private Integer pageIndex = 0;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}