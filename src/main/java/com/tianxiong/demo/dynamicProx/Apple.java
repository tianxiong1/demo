package com.tianxiong.demo.dynamicProx;


public class Apple implements Subject {
    @Override
    public void eat() {
        System.out.println("我要吃苹果");
    }
}
