package tech.yiyehu.aid.common.utils;

import org.apache.commons.httpclient.HttpStatus;

import java.util.HashMap;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/1 9:58
 */
public class Result extends HashMap<String, Object> {
    /**
     * 原型
     * @return Result
     */
    public static Result getPrototypeInstance(){
        return new Result().put("code","00000")
                .put("msg","success")
                .put("status", HttpStatus.SC_OK);
    }

    /**
     * 构造函数私有
     */
    private Result() { }

    public  Result create(String messageCode,int httpStatus) {
        return this .put("code",messageCode)
                .put("status", httpStatus);
    }

    public  Result create(String messageCode,HttpStatus status,String msg) {
        return this .put("code",messageCode)
                .put("status", status)
                .put("msg",msg);
    }


    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
