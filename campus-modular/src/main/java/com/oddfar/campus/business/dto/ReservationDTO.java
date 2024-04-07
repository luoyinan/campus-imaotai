package com.oddfar.campus.business.dto;

import lombok.Data;

import java.util.List;

/**
 * 预约DTO
 */
@Data
public class ReservationDTO {

    /**
     * 当前用户seesionID
     */
    private String sessionId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 店铺ID
     */
    private String shopId;

    /**
     * 需要申购的商品列表
     */
    private List<ItemInfoDTO> itemInfoList;

    /**
     * 真实参数
     */
    private String actParam;
}
