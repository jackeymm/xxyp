package com.xxyp.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by jackeymm on 2017/3/12.
 */
public class GzipUtils {
    public static final int BUFFER = 1024;

    public GzipUtils() {
    }

    public static byte[] compress(byte[] data) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        compress(bais, baos);
        byte[] output = baos.toByteArray();
        baos.flush();
        baos.close();
        bais.close();
        return output;
    }

    @SuppressWarnings("Since15")
    public static void compress(InputStream is, OutputStream os) throws Exception {
        GZIPOutputStream gos = new GZIPOutputStream(os);
        byte[] data = new byte[1024];

        int count;
        while((count = is.read(data, 0, 1024)) != -1) {
            gos.write(data, 0, count);
        }

        gos.finish();
        gos.flush();
        gos.close();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        for(int sourceStr = 0; sourceStr < 90; ++sourceStr) {
            sb.append("" + sourceStr);
        }

        String var5 = sb.toString();
        System.out.println("source length:" + var5.getBytes().length + ",source str length:" + var5.length());

        try {
            byte[] e = compress(var5.getBytes());
            System.out.println("after compress:" + e.length);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        System.out.println("gzip,deflate,sdch".indexOf("gzip"));
    }
}
