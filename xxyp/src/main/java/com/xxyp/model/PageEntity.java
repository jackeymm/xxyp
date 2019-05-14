package com.xxyp.model;

public class PageEntity implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private Integer pageSize = 10;
    private Integer pageIndex = 0;

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
