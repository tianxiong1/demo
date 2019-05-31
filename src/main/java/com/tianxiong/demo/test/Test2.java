package com.tianxiong.demo.test;

public class Test2 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.i = 1000;
        System.out.println("传进去的c"+c1+"----"+c1.i);
        C c = a(c1);
        System.out.println("出来后的c1"+c1+"----"+c1.i);
        System.out.println("出来后的c"+c+"----"+c.i);

        String a = "drer"+null;
        System.out.println("aaaa"+a);
    }
    static C a(C c){
        C c2 = new C();
        c2.i = 9999;
        c = c2;
        System.out.println("方法里面的c"+c+"----"+c.i);
        return c;
    }
}
class C{
    int i;
}
