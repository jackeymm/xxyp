package com.xxyp.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by jackeymm on 2017/3/12.
 */
public class JsonConvertObject{
    private static final Logger log = Logger.getLogger(JsonConvertObject.class);
    private static Gson gson = (new GsonBuilder()).setDateFormat("yyyy-MM-dd HH:mm").create();

    public JsonConvertObject() {
    }

    public static synchronized <T extends AbstractInput> T convertMapToObjectArray(Map<String, String[]> mapStr, Class<T> bizDestClassType) {
        if(mapStr == null) {
            throw new IllegalArgumentException("the orig jsonStr is null ");
        } else if(bizDestClassType == null) {
            throw new IllegalArgumentException("the dest class is null ");
        } else {
            AbstractInput t = null;

            try {
                if(!mapStr.isEmpty()) {
                    HashMap e = new HashMap();
                    Iterator temp = mapStr.keySet().iterator();

                    while(temp.hasNext()) {
                        String key = (String)temp.next();
                        e.put(key, ((String[])mapStr.get(key))[0]);
                    }

                    String temp1 = gson.toJson(e);
                    t = (AbstractInput)gson.fromJson(temp1, bizDestClassType);
                }
            } catch (Exception var6) {
                log.error(var6.getMessage(), var6);
            }

            return (T) t;
        }
    }
}
