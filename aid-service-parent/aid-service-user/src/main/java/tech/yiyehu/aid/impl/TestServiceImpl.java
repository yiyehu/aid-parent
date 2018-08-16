package tech.yiyehu.aid.impl;

import com.alibaba.dubbo.config.annotation.Service;
import tech.yiyehu.aid.service.TestService;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/9 14:18
 */
@Service(timeout = 5000)
public class TestServiceImpl implements TestService {

    @Override
    public String test() {

        return "tech.yiyehu.aid.impl.TestServiceImpl";
    }
}
