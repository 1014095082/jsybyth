package com.hnss.jsybyth.service.impl;

import com.hnss.jsybyth.entity.TGasOutput;
import com.hnss.jsybyth.mapper.TGasOutputMapper;
import com.hnss.jsybyth.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * /**
 *
 * @Author zengtao
 * @ClassName TestServiceImpl
 * @Description 测试接口实现类
 * @Date 2021-05-24 15:06
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TGasOutputMapper tGasOutputMapper;

    /***
     * 功能描述《根据管道ID查询管道信息》
     * @Param id :管道编号
     * @return
     */
    @Override
    public List<TGasOutput> getChannelInfosById(String id) {
        List<TGasOutput> tGasOutputs = tGasOutputMapper.selectById(id);
        return tGasOutputs;
    }
}
