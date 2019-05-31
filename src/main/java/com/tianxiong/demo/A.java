package com.tianxiong.demo;

import java.math.BigDecimal;

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.getClass().getClassLoader().getParent();
        BigDecimal aDouble =new BigDecimal(1.22);

        System.out.println("construct with a double value: "+aDouble);

        BigDecimal aString = new BigDecimal("1.22");

        System.out.println("construct with a String value: " + aString);

        BigDecimal aint =new BigDecimal(1.1);

        System.out.println("construct with a double value: "+aint);
    }
}
