package com.xxyp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jackeymm on 2017/3/12.
 */
public class DateUtils {
    private static final String solt = "0";

    public DateUtils() {
    }

    public static String date2Str(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format.format(date);
    }

    public static Long genRandom() {
        StringBuffer time = new StringBuffer();
        time.append(System.currentTimeMillis());
        int random = (int)(Math.random() * 1000.0D);
        if(random < 100) {
            time.append("0");
        }

        if(random < 10) {
            time.append("0");
        }

        return Long.valueOf(Long.parseLong(time.append(random).toString()));
    }
}
