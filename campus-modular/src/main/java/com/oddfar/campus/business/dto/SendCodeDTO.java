package com.oddfar.campus.business.dto;

import lombok.Data;

/**
 * 获取验证码dto
 */
@Data
public class SendCodeDTO extends CommonDTO {

    /**
     * 手机号
     */
    private String mobile;
}
