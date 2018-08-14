package tech.yiyehu.aid.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;
import tech.yiyehu.aid.common.utils.MessageSourceUtils;
import tech.yiyehu.aid.common.utils.Result;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/3 16:49
 */
public class ResultReturnHandler implements HandlerMethodReturnValueHandler {

    @Autowired
    MessageSourceUtils messageSourceUtils;

    @Override
    public boolean supportsReturnType(MethodParameter methodParameter) {
        return methodParameter.getGenericParameterType().equals(Result.class);
    }

    @Override
    public void handleReturnValue(Object o, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {

        Result result = (Result) o;
        if(result.get("msg")==null||"".equals(result.get("msg"))){
            if(result.get("parameters")!=null){
                result.put("msg",messageSourceUtils.getMessage(result.get("code").toString(), (Object[])result.get("parameters")));
            }else{
                result.put("msg",messageSourceUtils.getMessage(result.get("code").toString(),null));
            }
        }
    }
}
