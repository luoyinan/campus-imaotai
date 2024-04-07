package com.oddfar.campus.business.dto;

import lombok.Data;

/**
 * 申购商品信息
 */
@Data
public class ItemInfoDTO {

    /**
     * 数量
     */
    private Integer count;

    /**
     * 商品ID（茅台ID）
     */
    private String itemId;
}
