package com.hnss.jsybyth.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName ResultCodeEnum
 * @Description 返回值枚举
 * @Date 2021-05-24 14:37
 **/

@Getter
public enum ResultCodeEnum {

    SUCCESS(true,200,"成功"),
    UNKNOWN_ERROR(false,201,"未知错误"),
    PARAM_ERROR(false,202,"参数错误"),
    NULL_POINT(false,203,"空指针异常"),
    HTTP_CLIENT_ERROR(false,204,"客户端连接异常"),;

    @Getter
    private Boolean success;
    @Getter
    private Integer code;
    @Getter
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
