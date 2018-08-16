package tech.yiyehu.aid.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.httpclient.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.yiyehu.aid.service.TestService;
import tech.yiyehu.framework.front.utils.Result;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/8 9:12
 */
@RestController
@RequestMapping("/")
@Api(value = "测试Controller", tags = "测试")
public class TestController extends BaseController {

    @Reference
    private TestService testService;

    @Autowired
    private MessageSource messageSource;

    @ApiOperation("测试方法")
    @GetMapping("test")
    public Result test() {
        return Result.getPrototypeInstance().create("00000", HttpStatus.SC_OK);
    }
}
