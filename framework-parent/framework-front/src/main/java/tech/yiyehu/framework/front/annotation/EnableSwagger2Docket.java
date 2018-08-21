package tech.yiyehu.framework.front.annotation;

import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tech.yiyehu.framework.front.config.Swagger2Docket;
import tech.yiyehu.framework.front.config.Swagger2DocketConfig;
import tech.yiyehu.framework.front.config.SwaggerWebMvcConfig;

import java.lang.annotation.*;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/10 14:25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({Swagger2Docket.class,Swagger2DocketConfig.class})
@EnableSwagger2
public @interface EnableSwagger2Docket {

}
