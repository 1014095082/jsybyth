package com.hnss.jsybyth.service;

import com.hnss.jsybyth.VO.ChannelVO;

import java.util.List;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName TestService
 * @Description 测试服务接口
 * @Date 2021-05-24 15:03
 **/
public interface TestService {

    /***
     * 功能描述《根据管道ID查询管道信息》
     * @Param id :管道编号
     * @return
     **/
    List<ChannelVO> getChannelInfosById(String id);
}
