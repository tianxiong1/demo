package com.tianxiong.demo.json;

import java.io.Serializable;

public class BenhuiCallBackResponseVo implements Serializable {
    /**
     *  返回状态
     */
    private String state;
    /**
     * 返回编码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
