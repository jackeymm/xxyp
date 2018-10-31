package com.xxyp.model;

/**
 * Created by jackeymm on 2018/3/28.
 */
public class TokenEntity {
    private String isSuccess;
    private String token;
    private Long UserId;


    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
