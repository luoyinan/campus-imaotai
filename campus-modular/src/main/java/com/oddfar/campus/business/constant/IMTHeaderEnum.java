package com.oddfar.campus.business.constant;


public enum IMTHeaderEnum {
    MT_DEVICE_ID("MT-Device-ID",null),
    MT_APP_VERSION("MT-APP-Version",null),
    USER_AGENT("User-Agent","iOS;16.3;Apple;?unrecognized?"),
    CONTENT_TYPE("Content-Type","application/json"),
    MT_INFO("MT-Info","028e7f96f6369cafe1d105579c5b9377"),
    USER_ID("userId",null),
    MT_TOKEN("MT-Token",null),
    MT_LAT("MT-Lat",null),
    MT_LNG("MT-Lng",null),
    ;
    /**
     * header对应的key
     */
    private String key;

    /**
     * header对应的value
     */
    private String value;

    IMTHeaderEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
