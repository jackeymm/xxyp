package com.xxyp.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;

/**
 * Created by jackeymm on 2017/3/12.
 */
public class FacadeResult implements Serializable {
    private static final long serialVersionUID = 3114794797668742669L;
    private static final Gson gson = (new GsonBuilder()).disableHtmlEscaping().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    private Meta meta;
    private Object data;

    public FacadeResult() {
    }

    public FacadeResult(int code, String message) {
        this.meta = new Meta(Integer.valueOf(code), message);
    }

    public FacadeResult(CodeMsg cm) {
        this.meta = new Meta(cm);
    }

    public FacadeResult(int code, String message, Object data) {
        this.meta = new Meta(Integer.valueOf(code), message);
        this.data = data;
    }

    public FacadeResult(Object data) {
        this.meta = new Meta(CodeMsg.SUCCESS);
        this.data = data;
    }

    public static FacadeResult success(Object data) {
        FacadeResult result = new FacadeResult();
        result.meta = new Meta(CodeMsg.SUCCESS);
        result.data = data;
        return result;
    }

    public static FacadeResult build(int code, String message) {
        FacadeResult result = new FacadeResult();
        result.meta = new Meta(Integer.valueOf(code), message);
        return result;
    }

    public static FacadeResult build(CodeMsg cm) {
        FacadeResult result = new FacadeResult();
        result.meta = new Meta(cm.getCode(), cm.getMsg());
        return result;
    }

    public FacadeResult error(int code, String message) {
        this.meta = new Meta(Integer.valueOf(code), message);
        return this;
    }

    public FacadeResult(Integer total, Integer offset, Integer limit, Object data) {
        this.meta = new Meta(CodeMsg.SUCCESS.getCode(), CodeMsg.SUCCESS.getMsg(), total, offset, limit);
        this.data = data;
    }

    public String toString() {
        return this.toJsonString((String)null);
    }

    public String toString(String msg) {
        return this.toJsonString(msg);
    }

    protected String toJsonString(String msg) {
        return gson.toJson(this).toString();
    }

    public Meta getMeta() {
        return this.meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}