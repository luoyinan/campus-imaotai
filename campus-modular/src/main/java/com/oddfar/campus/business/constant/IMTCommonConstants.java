package com.oddfar.campus.business.constant;

/**
 * 常用的缓存
 */
public interface IMTCommonConstants {
    /**
     * imt版本key
     */
    String IMT_VERSION_KEY = "mt_version";

    /**
     * 店铺缓存key
     */
    String IMT_SHOP_KEY = "mt_shop_list";

    /**
     * SEESION缓存key
     */
    String IMT_SESSION_ID_KEY = "mt_session_id";

    /**
     * 获取茅台版本的正则
     */
    String VESRION_PATTERN = "new__latest__version\">(.*?)</p>";

    /**
     * token过期的消息(如果消息中含有该串，说明token无效)
     */
    String TOKEN_EXPIRED_MESSAGE = "token expired";
}
