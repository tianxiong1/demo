package com.tianxiong.demo.test;

public class Duotai {
    public static void main(String[] args) {
        P p = new P();
        p.a(); //父类的a
        p.c();//父类中的未重写c
        C2 c2 = new C2();
        c2.a();//子类的a
        c2.b();//子类特有的b
        c2.c();//父类中的未重写c
        P p2 = new C2();
        p2.c();//父类中的未重写c
        p2.a();//子类的a
        ((C2)p2).b();//子类特有的b
    }
}
class P{
    public void  a(){
        System.out.println("父类的a");
    }
    public  void c(){
        System.out.println("父类中的未重写c");
    }
}
class C2 extends P{
    @Override
    public void a() {
        System.out.println("子类的a");
    }
    void  b(){
        System.out.println("子类特有的b");
    }
}