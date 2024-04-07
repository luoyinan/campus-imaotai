package com.oddfar.campus.business.dto;

import lombok.Data;

/**
 * 登录dto
 */
@Data
public class IMTLoginDTO extends CommonDTO {
    /**
     * 手机号
     */
    private String mobile;

    /**
     * 验证码
     */
    private String vCode;
}
