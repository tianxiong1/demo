package com.tianxiong.demo.controller;

import java.io.Serializable;

public class ClaimRequest implements Serializable {
    private String status;

    private String message;

    private String policyNo;

    private String orderNo;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "ClaimRequest{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", policyNo='" + policyNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
