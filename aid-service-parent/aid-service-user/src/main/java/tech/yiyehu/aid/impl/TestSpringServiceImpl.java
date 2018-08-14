package tech.yiyehu.aid.impl;

import com.alibaba.dubbo.config.annotation.Service;
import tech.yiyehu.aid.service.TestSpringService;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/9 17:33
 */
@Service(timeout = 5000)
public class TestSpringServiceImpl implements TestSpringService{

    @Override
    public void test(){}
}
