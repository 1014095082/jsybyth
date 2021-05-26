package com.hnss.jsybyth.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * JS_channel
 * @author 
 */
@ApiModel(value="com.hnss.jsybyth.entity.JsChannel")
@Data
public class JsChannel implements Serializable {
    /**
     * 管道编号
     */
    @ApiModelProperty(value="管道编号")
    private String gNo;

    /**
     * 管道地图编号
     */
    @ApiModelProperty(value="管道地图编号")
    private String gMapNo;

    /**
     * 管道名字
     */
    @ApiModelProperty(value="管道名字")
    private String gName;

    /**
     * 管道最大高度
     */
    @ApiModelProperty(value="管道最大高度")
    private Double gMaxHeight;

    /**
     * 管道类型 （1.中水管网 ，2.w污水管网，3.市政给水管网，温泉管网，5.传输涵洞）
     */
    @ApiModelProperty(value="管道类型 （1.中水管网 ，2.w污水管网，3.市政给水管网，温泉管网，5.传输涵洞）")
    private String channelType;

    /**
     * 管道类型描述
     */
    @ApiModelProperty(value="管道类型描述")
    private String channelTypeDesc;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}