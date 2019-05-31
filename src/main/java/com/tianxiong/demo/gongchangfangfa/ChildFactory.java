package com.tianxiong.demo.gongchangfangfa;

public class ChildFactory implements Factory {
    @Override
    public People createPeople() {
        return new Child();
    }
}
