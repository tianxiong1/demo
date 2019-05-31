package com.tianxiong.demo.json;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        String responseStr = "";
        BenhuiCallBackResponseVo benhuiCallBackResponseVo =  JSON.parseObject(responseStr,BenhuiCallBackResponseVo.class);
    }
}
