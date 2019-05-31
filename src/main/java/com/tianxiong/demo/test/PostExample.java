/*
package com.tianxiong.demo.test;

import okhttp3.*;

import java.io.IOException;


public class PostExample {
    public static final MediaType JSON =  MediaType.parse("application/json; charset=utf-8");

    static OkHttpClient client = new OkHttpClient();

    static String post(String url, String json) throws Exception {
        Request request = new Request.Builder().url(url)
                .post(RequestBody.create(JSON, json)).build();

        Response response = client.newCall(request).execute();
       */
/* if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }*//*

        return response.body().string();
    }

    static String bowlingJson(String player1, String player2) {
        return "{'winCondition':'HIGH_SCORE',"
                + "'name':'Bowling',"
                + "'round':4,"
                + "'lastSaved':1367702411696,"
                + "'dateStarted':1367702378785,"
                + "'players':["
                + "{'name':'" + player1 + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
                + "{'name':'" + player2 + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
                + "]}";
    }

    public static void main(String[] args) throws IOException {
       // PostExample example = new PostExample();
        String json = PostExample.bowlingJson("Jesse", "Jake");
        String response = PostExample.post("http://70.19.0.99", json);
        System.out.println(response);
    }
}
*/
