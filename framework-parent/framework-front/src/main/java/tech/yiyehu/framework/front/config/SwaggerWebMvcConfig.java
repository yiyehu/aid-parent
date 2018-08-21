package tech.yiyehu.framework.front.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/10 16:38
 */
@Deprecated
public class SwaggerWebMvcConfig extends WebMvcConfigurationSupport {
    private Logger logger = LoggerFactory.getLogger(SwaggerWebMvcConfig.class);
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.info("SwaggerWebMvcConfig registry");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
