package com.hnss.jsybyth.mapper;

import com.hnss.jsybyth.entity.JsChannel;

public interface JsChannelMapper {
    int deleteByPrimaryKey(String gNo);

    int insert(JsChannel record);

    int insertSelective(JsChannel record);

    JsChannel selectByPrimaryKey(String gNo);

    int updateByPrimaryKeySelective(JsChannel record);

    int updateByPrimaryKey(JsChannel record);
}