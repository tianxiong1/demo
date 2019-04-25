package com.tianxiong.demo.gongchangfangfa;

public class ManFactory implements Factory {
    @Override
    public People createPeople() {
        return new Man();
    }
}
