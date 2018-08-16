package tech.yiyehu.framework.common.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 标记要统计的被调用方法
 *
 * @author yiyehu
 * @version 创建时间：2018/8/1 13:52
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CountApi {

    /**
     * @return name 统计的名称
     */
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";
}
