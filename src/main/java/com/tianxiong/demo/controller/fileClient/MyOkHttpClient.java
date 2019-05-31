package com.tianxiong.demo.controller.fileClient;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyOkHttpClient {

    public static final MediaType FROM_DATA  =  MediaType.parse("multipart/form-data");

    public static OkHttpClient client = new OkHttpClient();


    public static  void sendFromDataPostRequest()throws IOException {
        OkHttpClient okHttpClient  = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();


        File file = new File("yiye.png");
        List<File> fileList = new ArrayList<>();
        fileList.add(file);
        //post方式提交的数据
        FormBody formBody = new FormBody.Builder()
                .add("fileList", JSON.toJSONString(fileList))
                .add("policyNo", "50")
                .build();
        RequestBody fileBody = RequestBody.create(MediaType.parse("image/png"), file);
        RequestBody requestBody=new MultipartBody.Builder()
                .addFormDataPart("fileList","filename",fileBody)
                .addFormDataPart("fileList","filename",fileBody)
                .addFormDataPart("fileList","filename",fileBody)
                .addFormDataPart("policyNo","value")
                .build();

        final Request request = new Request.Builder()
                .url("http://127.0.0.1:8080/testFile")//请求的url
                .post(requestBody)
                .build();


        //创建/Call
        Call call = okHttpClient.newCall(request);
        //加入队列 异步操作
        call.enqueue(new Callback() {
            //请求错误回调方法
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("连接失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.code()==200) {
                    System.out.println(response.body().string());
                }
            }
        });

    }

    public static void main(String[] args) throws  Exception{
        sendFromDataPostRequest();
    }

}
