package com.tianxiong.demo.test;

public class A {
    public static void main(String[] args) {
        A aa = new A();
        aa.fi();
    }

    private void fi() {
        int i = 1;
        Va va = new Va();
        va.i = 11;
        System.out.println(va.i);
        System.out.println("va类1："+va);
        se(va,i);
        System.gc();
        System.out.println("va类2："+va);
        System.out.println(va.i);
    }

    private void se(Va va, int i) {
        System.out.println("入参va："+va);
        i=2;
        va.i=22;
        Va va1 = new Va();
        va = va1;
        System.gc();
        System.out.println("va类3："+va+"va1类3："+va1);
        System.out.println(va1.i+"==="+va.i);
        va.i=1000000;
    }
}
class Va{
    public int i = 0;
}
