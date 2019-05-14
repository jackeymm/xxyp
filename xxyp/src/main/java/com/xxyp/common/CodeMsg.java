package com.xxyp.common;

/**
 * Created by jackeymm on 2017/3/12.
 */
public enum CodeMsg {
    SUCCESS(0, "success"),
    ERROR(100000, "error"),
    HEADER_INFO_ERROR(100001, "请求头信息为空"),
    USERID_ERROR(100002, "userID为空"),
    USERID_WRONG_ERROR(100007, "userID不合法"),
    USERAGENT_ERROR(100003, "useragent为空"),
    TOKEN_ERROR(100004, "token不合法为空"),
    USERAGENT_RESLOVE_ERROR(100005, "useragent不合法"),
    USERAGENT_APPVERSION_ERROR(100006, "appVersion不合法"),
    TOKEN_AUTH_SERVER_ERROR(100010, "token认证服务器失败"),
    TOKEN_AUTH_FAILURE(100011, "token认证失败"),
    USERID_NOTMATCH_TOKEN_ERROR(100012, "userID和token不匹配"),
    NOTSUPPORTED_SIGN_TYPE(100013, "不支持的签名加密类型"),
    REQUESTBODY_PARSE_ERROR(100025, "请求Body解析失败"),
    UNKNOW(100016, "未知错误"),
    DATED_ERROR(100018, "已有人接单约拍"),
    PARAM_ERROR(100019, "请求参数错误"),
    EMPTY(100017, "数据为空");

    private int code;
    private String msg;

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return Integer.valueOf(this.code);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public static CodeMsg getMessageKey(int code) {
        CodeMsg[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CodeMsg v = var1[var3];
            if(code == v.getCode().intValue()) {
                return v;
            }
        }

        return UNKNOW;
    }
}