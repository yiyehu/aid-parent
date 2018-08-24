package tech.yiyehu.framework.front;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tech.yiyehu.framework.front.annotation.EnableSwagger2Docket;
import tech.yiyehu.framework.front.config.ResultReturnWebMvcConfig;



/**
 * @author yiyehu
 * @version 创建时间：2018/8/21 15:26
 */
@Configuration
@Import({ResultReturnWebMvcConfig.class})
public class WebFrontAutoConfiguration {

    @EnableSwagger2Docket
    public static class EnableSwagger2DocketConfiguration{
    }

//    @EnableResultReturnAspect
//    public static class EnableResultReturnAspectConfiguration{
//
//    }
}
