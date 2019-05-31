package com.tianxiong.demo.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

public class FileVo  implements Serializable {
    private List<MultipartFile> fileList;
    private String policyNo;

    public List<MultipartFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<MultipartFile> fileList) {
        this.fileList = fileList;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
}
