package tech.yiyehu.framework.front.annotation;

import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tech.yiyehu.framework.front.aspect.ResultReturnAspect;

import java.lang.annotation.*;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/16 11:09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({ResultReturnAspect.class})
@EnableSwagger2
public @interface EnableResultReturnAspect {

}
