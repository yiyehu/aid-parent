package tech.yiyehu.framework.front.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import tech.yiyehu.framework.front.utils.Result;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/16 11:01
 */
@Aspect
@Configuration
public class ResultReturnAspect {

    @Autowired
    private MessageSource messageSource;

    private Logger logger = LoggerFactory.getLogger(getClass());
    //是否开启redis缓存  true开启   false关闭
//    @Value("${spring.redis.open: false}")
//    private boolean open;

    @Around("execution(tech.yiyehu.framework.front.utils.Result *.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Result result = null;
        try{
            result = (Result) point.proceed();
            if(result.get("msg")==null||"".equals(result.get("msg"))){
                if(result.get("parameters")!=null){
                    result.put("msg",messageSource.getMessage(result.get("code").toString(), (Object[])result.get("parameters"), LocaleContextHolder.getLocale()));
                }else{
                    result.put("msg",messageSource.getMessage(result.get("code").toString(),null,LocaleContextHolder.getLocale()));
                }
            }

        }catch (Exception e){
            logger.error("MessageSource处理异常", e);
            throw new Exception("MessageSource处理异常");
        }
        return result;
    }
}
