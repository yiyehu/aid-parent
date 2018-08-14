package tech.yiyehu.aid.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/3 10:07
 */
@Component
public class MessageSourceUtils {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String code,Object[] args){
        return messageSource.getMessage(code,args, LocaleContextHolder.getLocale());
    }

    public String getMessage(String code,Object[] args,String defaultMessage){
        return messageSource.getMessage(code,args, defaultMessage,LocaleContextHolder.getLocale());
    }
}
