package com.hnss.jsybyth.mapper;

import com.hnss.jsybyth.entity.TGasOutput;
import com.hnss.jsybyth.entity.TGasOutputKey;

import java.util.List;

public interface TGasOutputMapper {
    List<TGasOutput> selectById(String id);
}