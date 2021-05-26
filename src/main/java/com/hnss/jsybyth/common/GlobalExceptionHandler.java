package com.hnss.jsybyth.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.ExceptionUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName GlobalExceptionHandler
 * @Description 统一异常处理
 * @Date 2021-05-24 15:46
 **/

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * -------- 通用异常处理方法 --------
     **/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultUtils error(Exception e) {
        // 通用异常结果打印到日志
        log.error(e.getMessage());
        return ResultUtils.error();
    }

    /**
     * -------- 指定异常处理方法 --------
     **/
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResultUtils error(NullPointerException e) {
        e.printStackTrace();
        return ResultUtils.setResult(ResultCodeEnum.NULL_POINT);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseBody
    public ResultUtils error(IndexOutOfBoundsException e) {
        e.printStackTrace();
        return ResultUtils.setResult(ResultCodeEnum.HTTP_CLIENT_ERROR);
    }

    /**
     * -------- 自定义定异常处理方法 --------
     **/
    @ExceptionHandler(ExceptionWrap.class)
    @ResponseBody
    public ResultUtils error(ExceptionWrap e) {
        e.printStackTrace();
        return ResultUtils.error().message(e.getMessage()).code(e.getCode());
    }

}
