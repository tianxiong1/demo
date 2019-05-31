package com.tianxiong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/testFile")
public class OkhttpFileUpController {

    @RequestMapping("")
    @ResponseBody
    public String up(@ModelAttribute FileVo fileVo) throws  Exception{
        System.out.println(fileVo);
        InputStream inputStream = fileVo.getFileList().get(0).getInputStream();
        OutputStream os = new FileOutputStream("yiye.png");
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        inputStream.close();
        return "";
    }
}
