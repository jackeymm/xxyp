package com.xxyp.common;

/**
 * Created by jackeymm on 2017/4/15.
 */
public class BaseException extends Exception {
    private static final long serialVersionUID = -1170667680102576503L;
    private Integer statusCode;
    private String errorMessage;

    public BaseException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public BaseException(Integer statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(Integer statusCode, String errorMessage, Throwable e) {
        super(e);
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    }

