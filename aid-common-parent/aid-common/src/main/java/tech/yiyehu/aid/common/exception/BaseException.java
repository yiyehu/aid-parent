package tech.yiyehu.aid.common.exception;

import org.apache.commons.httpclient.HttpStatus;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/1 8:50
 */
public class BaseException extends RuntimeException{
    private String code;
    private String msg;
    private int status;

    public BaseException(String code) {
        this.code = code;
    }

    public BaseException(String code, int status) {
        this.code = code;
        this.status = status;
    }

    public BaseException(String code, String msg, int status) {
        super(msg);
        this.msg = msg;
        this.code = code;
        this.status = status;
    }

    public BaseException(String code, String msg, int status, Throwable e) {
        super(msg,e);
        this.msg = msg;
        this.code = code;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
