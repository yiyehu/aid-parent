package tech.yiyehu.framework.front.converter;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import tech.yiyehu.framework.front.utils.Result;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/23 11:05
 */
public class ResultReturnMessageConverter extends MappingJackson2HttpMessageConverter {

    private MessageSource messageSource;

    public ResultReturnMessageConverter(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
    //    HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        if (type.getTypeName().contains("springfox")) {
            super.writeInternal(object, null, outputMessage);
        } else if (object instanceof Result && ((Result) object).containsKey("code")) {

            Result result = (Result) object;
            if (result.get("msg") == null || "".equals(result.get("msg"))) {
                if (result.get("parameters") != null) {
                    result.put("msg", messageSource.getMessage(result.get("code").toString(), (Object[]) result.get("parameters"), LocaleContextHolder.getLocale()));
                } else {
                    result.put("msg", messageSource.getMessage(result.get("code").toString(), null, LocaleContextHolder.getLocale()));
                }
            }
            super.writeInternal(result, type, outputMessage);
        }
    }
}
