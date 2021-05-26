package com.hnss.jsybyth.control;

import com.hnss.jsybyth.common.ResultUtils;
import com.hnss.jsybyth.entity.TGasOutput;
import com.hnss.jsybyth.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author chenggang
 * @ClassName TestControl
 * @Description 测试control
 * @Date 2021-05-24 13:45
 **/

@Slf4j
@Api(description = "测试control")
@RestController("/test")
public class TestControl {

    @Autowired
    TestService  testService;

    @ApiOperation(value = "测试方法")
    @GetMapping(value = "/hello")
    public Object hello( /* 参数注解 */ @ApiParam(value = "管道ID", required = true) @RequestParam String id) {
        log.info("测试方法日志");
        List<TGasOutput> channelInfosById =testService.getChannelInfosById(id);
        return ResultUtils.success().data("data",channelInfosById);
    }


}
