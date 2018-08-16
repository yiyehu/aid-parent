package tech.yiyehu.framework.common.exception;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/1 8:50
 */
public class BaseException extends RuntimeException{
    private String code;
    private String msg;
    private int httpStatus;

    public BaseException(String code) {
        this.code = code;
    }

    public BaseException(String code, int httpStatus) {
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public BaseException(String code, String msg, int httpStatus) {
        super(msg);
        this.msg = msg;
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public BaseException(String code, String msg, int httpStatus, Throwable e) {
        super(msg,e);
        this.msg = msg;
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
