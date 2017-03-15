package com.xxyp.common;

import com.google.gson.GsonBuilder;
import com.xxyp.utils.GzipUtils;
import com.xxyp.utils.StringUtils;
import io.swagger.annotations.Api;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Controller
@Scope("prototype")
@Api(value = "user", tags = "User Category", description = "User endpoint")
public class BaseController {
    private Logger log = Logger.getLogger(BaseController.class);
    private static com.google.gson.Gson Gson = (new GsonBuilder()).disableHtmlEscaping().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    protected ThreadLocal<HttpServletRequest> requestLocal = new ThreadLocal();
    protected ThreadLocal<HttpServletResponse> responseLocal = new ThreadLocal();
    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal("ControllerTimeWatch");
    protected Long operateTime;
    private static final String UTF8_CHARSET_ENCODING = "UTF-8";
    private static final int COMPRESS_THRESHOLD_LENGTH = 200;

    public BaseController() {
    }

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        long beginTime = System.currentTimeMillis();
        this.startTimeThreadLocal.set(Long.valueOf(beginTime));
        this.requestLocal.set(request);
        this.responseLocal.set(response);
    }

    protected <T extends AbstractInput> T parseBizObjectFromRequst(Class<T> destClassType) {
        Map map = null;

        try {
            map = ((HttpServletRequest)this.requestLocal.get()).getParameterMap();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        AbstractInput t = JsonConvertObject.convertMapToObjectArray(map, destClassType);
        return (T) t;
    }


    private static String replaceLocalIPtoReqURL(String localIP, String reqURL) {
        if(localIP != null && reqURL != null) {
            String result = "";

            try {
                if(reqURL.indexOf("//") > -1 && reqURL.lastIndexOf(":") > -1) {
                    result = reqURL.substring(0, reqURL.indexOf("//") + 2) + localIP + reqURL.substring(reqURL.lastIndexOf(":"), reqURL.length());
                }
            } catch (Exception var4) {
                var4.printStackTrace();
            }

            return result;
        } else {
            return "";
        }
    }

    public void outputData() {
        HashMap map = new HashMap();
        this.outputData(map);
    }

    public void outputData(Object obj) {
        FacadeResult result = FacadeResult.success(obj);
        String data = result.toString();
        this.finalOutput(data);
    }

    public void outputData(Integer total, Integer offset, Integer limit, Object data) {
        FacadeResult result = new FacadeResult(total, offset, limit, data);
        this.finalOutput(result.toString());
    }

    public void outputException(int code, String message) {
        FacadeResult result = FacadeResult.build(code, message);
        HashMap nullData = new HashMap();
        result.setData(nullData);
        String data = result.toString();
        this.finalOutput(data);
    }

    public void outputException(int code, String message, Object obj) {
        FacadeResult result = FacadeResult.build(code, message);
        if(obj == null) {
            HashMap data = new HashMap();
            result.setData(data);
        } else {
            result.setData(obj);
        }

        String data1 = result.toString();
        this.finalOutput(data1);
    }

    private void finalOutput(String data) {
        String clientEncoding = ((HttpServletRequest)this.requestLocal.get()).getHeader("Accept-Encoding");
        this.log.debug("+++++++++++++++++++++++++finalOutput clientEncoding:" + clientEncoding + "++++++++++++++++++++++++");
        boolean canGzip = false;
        if(clientEncoding != null && clientEncoding.indexOf("gzip") > -1 && StringUtils.null2Str(data).length() >= 200) {
            canGzip = true;
            ((HttpServletResponse)this.responseLocal.get()).setHeader("Content-Encoding", "gzip");
        }

        this.log.debug("+++++++++++++++++++++++++finalOutput canGzip:" + canGzip + "++++++++++++++++++++++++");
        ((HttpServletResponse)this.responseLocal.get()).setCharacterEncoding("UTF-8");

        try {
            if(canGzip) {
                byte[] e = this.compressData(data);
                ServletOutputStream out = ((HttpServletResponse)this.responseLocal.get()).getOutputStream();
                out.write(e);
                out.flush();
                out.close();
            } else {
                ((HttpServletResponse)this.responseLocal.get()).getWriter().append(data);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    private byte[] compressData(String data) {
        byte[] bytes = null;

        try {
            bytes = GzipUtils.compress(data.getBytes("UTF-8"));
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return bytes;
    }

    @ExceptionHandler({Exception.class})
    protected void handleException(Exception e) {
        this.log.error("API接口出现异常:", e);
        this.outputException(CodeMsg.ERROR.getCode().intValue(), CodeMsg.ERROR.getMsg());
    }
}