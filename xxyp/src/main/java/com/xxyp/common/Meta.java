package com.xxyp.common;

/**
 * Created by jackeymm on 2017/3/12.
 */
public class Meta {
    private Integer code;
    private String message;
    private Integer limit;
    private Integer offset;
    private Integer total;

    public Meta() {
    }

    public Meta(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Meta(CodeMsg cm) {
        this.code = cm.getCode();
        this.message = cm.getMsg();
    }

    public Meta(Integer total, Integer offset, Integer limit) {
        this.code = CodeMsg.SUCCESS.getCode();
        this.message = CodeMsg.SUCCESS.getMsg();
        this.total = total;
        this.offset = offset;
        this.limit = limit;
    }

    public Meta(Integer code, String message, Integer total, Integer offset, Integer limit) {
        this.code = code;
        this.message = message;
        this.total = total;
        this.offset = offset;
        this.limit = limit;
    }

    public Integer getCode() {
        return this.code;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
