package com.tianxiong.demo.api;

import org.springframework.stereotype.Service;

@Service
public class Child1 implements  Parent{
    @Override
    public void say() {
        System.out.println("我是Child1");
    }
}
