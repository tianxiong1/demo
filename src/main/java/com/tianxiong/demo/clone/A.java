package com.tianxiong.demo.clone;

public class A implements  Cloneable{
    B b = new B();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
