package com.tianxiong.demo.jiandangongchang;

public class Test {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Phone p = factory.createPhone("vivo");
        p.call();

        Factory factory1 = new Factory();
        Phone p2 = factory1.createPhone("vivo");
        p2.call();
    }
}
