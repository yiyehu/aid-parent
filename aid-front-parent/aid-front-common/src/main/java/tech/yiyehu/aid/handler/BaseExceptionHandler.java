package tech.yiyehu.aid.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tech.yiyehu.aid.common.utils.MessageSourceUtils;
import tech.yiyehu.aid.common.exception.BaseException;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/1 9:55
 */
@RestControllerAdvice
public class BaseExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MessageSourceUtils messageSourceUtils;

    @ExceptionHandler(BaseException.class)
    public BaseException handleBaseException(BaseException e){
        logger.error(e.getCode(),e);
        e.setMsg(messageSourceUtils.getMessage(e.getCode(),null,e.getMsg()));
        return e;
    }
}
