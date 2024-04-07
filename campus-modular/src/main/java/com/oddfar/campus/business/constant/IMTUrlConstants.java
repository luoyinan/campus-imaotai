package com.oddfar.campus.business.constant;

/**
 * Imt常量类
 */
public interface IMTUrlConstants {

    // ===========  用户相关接口地址 =============

    /**
     * 获取i茅台验证码
     */
    String GET_CODE_URL = "https://app.moutai519.com.cn/xhr/front/user/register/vcode";
    /**
     * 登录URL
     */
    String LOGIN_URL = "https://app.moutai519.com.cn/xhr/front/user/register/login";

    /**
     * 获取用户信息
     */
    String GET_USER_INFO_URL = "https://h5.moutai519.com.cn/game/isolationPage/getUserIsolationPageData";

    /**
     * 获取当前用户session
     */
    String GET_CURRENT_USER_SESSION = "https://static.moutai519.com.cn/mt-backend/xhr/front/mall/index/session/get/{dayTime}";

    // ===========  申购相关接口地址 =============
    /**
     * 预约申购
     */
    String RESERVATION_URL = "https://app.moutai519.com.cn/xhr/front/mall/reservation/add";

    /**
     * 申购查询
     */
    String RESERVATION_RESULT = "https://app.moutai519.com.cn/xhr/front/mall/reservation/list/pageOne/query";

    /**
     * 获取申购耐力值
     */
    String USER_ENERGY_AWARD_URL = "https://h5.moutai519.com.cn/game/isolationPage/getUserEnergyAward";

    // ===========  通用相关接口地址 =============

    /**
     * 获取茅台的版本号
     */
    String VERSION_URL = "https://apps.apple.com/cn/app/i%E8%8C%85%E5%8F%B0/id1600482450";

    /**
     * 开始旅行接口
     */
    String START_TRAVEL_URL = "https://h5.moutai519.com.cn/game/xmTravel/startTravel";

    /**
     * 获取旅行奖励
     */
    String TRAVEL_REWARD_URL = "https://h5.moutai519.com.cn/game/xmTravel/getXmTravelReward";

    /**
     * 获取本月剩余奖励耐力值
     */
    String EXCHANGE_RATE_INFO_URL = "https://h5.moutai519.com.cn/game/synthesize/exchangeRateInfo";

    /**
     * 领取每日首次分享获取耐力
     */
    String SHARE_REWARD_URL = "https://h5.moutai519.com.cn/game/xmTravel/shareReward";

    /**
     * 获取小茅运
     */
    String RECEIVE_REWARD_URL = "https://h5.moutai519.com.cn/game/xmTravel/receiveReward";

    /**
     * 获取当前产品城市的投放情况
     */
    String RE_GET_SHOPS_BY_PROVINCE_URL = "https://static.moutai519.com.cn/mt-backend/xhr/front/mall/shop/list/slim/v3/{currentSessionId}/{province}/{itemId}/{dayTime}";

    /**
     * 获取门店信息
     */
    String GET_SHOP_URL = "https://static.moutai519.com.cn/mt-backend/xhr/front/mall/resource/get";
}
