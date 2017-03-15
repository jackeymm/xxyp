package com.xxyp.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonNull;

/**
 * json转换工具
 * Created by jackeymm on 2017/3/12.
 */
public class GsonUtil {
    private static final Gson GSON_DEFAULT = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private GsonUtil(){
    }

    /**
     * 获取Gson实例
     * @return
     */
    public static Gson getGson(){
        return GSON_DEFAULT;
    }
    
    /**
     * @MethodName : toJson
     * @Description :将对象转为JSON串，此方法能够满足大部分需求
     * @param data:将要被转化的对象
     * @return :转化后的JSON串
     */
    public static String toJson(Object data) {
        if (data == null) {
            return GSON_DEFAULT.toJson(JsonNull.INSTANCE);
        }
        return GSON_DEFAULT.toJson(data);
    }

    /**
     * @MethodName : fromJson
     * @Description :将JSON串转为对象，
     * @param data:将要被转化的对象
     * @return :转化后的JSON串
     */
    public static Object fromJson(String data) {
        if (data == null) {
            return null;
        }
        return GSON_DEFAULT.fromJson(data,Object.class);
    }

}
