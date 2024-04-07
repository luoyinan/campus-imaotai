package com.oddfar.campus.business.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import com.oddfar.campus.business.constant.IMTCommonConstants;
import com.oddfar.campus.business.constant.IMTHeaderEnum;
import com.oddfar.campus.business.constant.IMTUrlConstants;
import com.oddfar.campus.common.core.RedisCache;
import com.oddfar.campus.common.utils.SpringUtils;
import com.oddfar.campus.common.utils.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * IMT 工具类
 */
public class IMTUils {

    private static RedisCache redisCache = SpringUtils.getBean("redisCache");

    /**
     * 获取茅台的版本号
     * @return
     */
    public static String getMTVersion(){
        String mtVersion = Convert.toStr(redisCache.getCacheObject(IMTCommonConstants.IMT_VERSION_KEY));
        if (StringUtils.isNotEmpty(mtVersion)) {
            return mtVersion;
        }
        String htmlContent = HttpUtil.get(IMTUrlConstants.VERSION_URL);
        Pattern pattern = Pattern.compile(IMTCommonConstants.VESRION_PATTERN, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(htmlContent);
        if (matcher.find()) {
            mtVersion = matcher.group(1);
            mtVersion = mtVersion.replace("版本 ", "");
        }
        redisCache.setCacheObject(IMTCommonConstants.IMT_VERSION_KEY, mtVersion);
        return mtVersion;
    }

    /**
     * 刷新I茅台的版本
     */
    public static void refreshMTVersion() {
        redisCache.deleteObject(IMTCommonConstants.IMT_VERSION_KEY);
        getMTVersion();
    }


    /**
     * 设置公共的请求头
     * @param request
     * @param deviceId
     */
    public static void setCommonHeader(HttpRequest request, String deviceId,boolean hasContentType){
        request.header(IMTHeaderEnum.MT_DEVICE_ID.getKey(), deviceId);
        request.header(IMTHeaderEnum.MT_APP_VERSION.getKey(), getMTVersion());
        request.header(IMTHeaderEnum.USER_AGENT.getKey(), IMTHeaderEnum.USER_AGENT.getValue());
        if(hasContentType){
            request.header(IMTHeaderEnum.CONTENT_TYPE.getKey(), IMTHeaderEnum.CONTENT_TYPE.getValue());
        }
    }

    /**
     * POST 通过URL获取公共的请求(有设置content-type)
     * @param url
     * @return
     */
    public static HttpRequest getCommonPostRequest(String url,String deviceId){
        HttpRequest request = HttpUtil.createRequest(Method.POST, url);
        setCommonHeader(request,deviceId,true);
        return request;
    }

    /**
     * POST 通过URL获取公共的请求(没有有设置content-type)
     * @param url
     * @return
     */
    public static HttpRequest getCommonPostRequestNoContentType(String url,String deviceId){
        HttpRequest request = HttpUtil.createRequest(Method.POST, url);
        setCommonHeader(request,deviceId,false);
        return request;
    }

    /**
     * POST 通过URL获取公共的请求(没有有设置content-type)
     * @param url
     * @return
     */
    public static HttpRequest getCommonGetRequestNoContentType(String url,String deviceId){
        HttpRequest request = HttpUtil.createRequest(Method.GET, url);
        setCommonHeader(request,deviceId,false);
        return request;
    }


}
