package com.tianxiong.demo.chouxianggongchang;

public class Test {
    public static void main(String[] args) {
        PcFactory pcFactory = new AppleFactory();
        EarPhone earPhone =   pcFactory.getEarPhone();
        earPhone.listen();
    }
}
