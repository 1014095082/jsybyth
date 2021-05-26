package com.hnss.jsybyth.common;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName ResultUtils
 * @Description 通用返回封装对象
 * @Date 2021-05-24 14:45
 **/
@Data
public class ResultUtils {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    /**
     * 构造器私有
     */
    private ResultUtils() {
    }

    /**
     * 通用返回成功
     */
    public static ResultUtils success() {
        ResultUtils r = new ResultUtils();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    /**
     * 通用返回失败，未知错误
     *
     * @return
     */
    public static ResultUtils error() {
        ResultUtils r = new ResultUtils();
        r.setSuccess(ResultCodeEnum.UNKNOWN_ERROR.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_ERROR.getCode());
        r.setMessage(ResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return r;
    }

    /**
     * 设置结果，形参为结果枚举
     *
     * @param result
     * @return
     */
    public static ResultUtils setResult(ResultCodeEnum result) {
        ResultUtils r = new ResultUtils();
        r.setSuccess(result.getSuccess());
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        return r;
    }

    /**
     * ------------使用链式编程，返回类本身----------
     * 自定义返回数据
     *
     * @param map
     * @return
     */
    public ResultUtils data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    /**
     * 通用设置data
     *
     * @param key
     * @param value
     * @return
     */
    public ResultUtils data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 自定义状态信息
     *
     * @param message
     * @return
     */
    public ResultUtils message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * 自定义状态码
     *
     * @param code
     * @return
     */
    public ResultUtils code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 自定义返回结果
     *
     * @param success
     * @return
     */
    public ResultUtils success(Boolean success) {
        this.setSuccess(success);
        return this;
    }
}
