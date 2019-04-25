package com.tianxiong.demo.gongchangfangfa;

public class WomanFactory implements Factory {
    @Override
    public People createPeople() {
        return new Woman();
    }
}
