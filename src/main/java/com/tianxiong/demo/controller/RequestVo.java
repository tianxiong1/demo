package com.tianxiong.demo.controller;

import java.io.Serializable;

public class RequestVo implements Serializable {
    private Header header;
    private Request request;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
