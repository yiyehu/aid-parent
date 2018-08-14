package tech.yiyehu.aid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import tech.yiyehu.aid.handler.ResultReturnHandler;

import java.util.List;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/3 16:44
 */
@Configuration
public class BaseWebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
        returnValueHandlers.add(new ResultReturnHandler());
        super.addReturnValueHandlers(returnValueHandlers);
    }

}
