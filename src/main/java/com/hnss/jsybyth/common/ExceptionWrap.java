package com.hnss.jsybyth.common;

import lombok.Data;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName ExceptionWarp
 * @Description 异常处理
 * @Date 2021-05-24 15:42
 **/

@Data
public class ExceptionWrap extends RuntimeException {

    private Integer code;

    public ExceptionWrap(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ExceptionWrap(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "ExceptionWrap{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
