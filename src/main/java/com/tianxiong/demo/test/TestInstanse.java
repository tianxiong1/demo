package com.tianxiong.demo.test;

public class TestInstanse {
    public static void main(String[] args) {
        AAA a = new AAA();
        BBB b = new BBB();
        boolean flag1 = a instanceof BBB;
        boolean flag2 = b instanceof BBB;
        boolean flag3 = a instanceof AAA;
        boolean flag4 = b instanceof AAA;
        System.out.println(flag1+"---"+flag2+"---"+flag3+"---"+flag4+"---");
    }
}
class  AAA{

}
class BBB extends AAA{

}
