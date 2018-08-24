package tech.yiyehu.framework.front.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import tech.yiyehu.framework.front.converter.ResultReturnMessageConverter;

import java.util.List;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/23 13:50
 */
@Configuration
public class ResultReturnWebMvcConfig extends WebMvcConfigurationSupport {

    private Logger logger = LoggerFactory.getLogger(ResultReturnWebMvcConfig.class);

    @Autowired
    MessageSource messageSource;

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        logger.info("add ResultReturnMessageConverter");
        converters.add(new ResultReturnMessageConverter(messageSource));

        addDefaultHttpMessageConverters(converters);
    }
}
