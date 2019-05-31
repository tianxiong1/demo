package com.tianxiong.demo.gongchangfangfa;

public class Test {
    public static void main(String[] args) {
        Factory factory = new WomanFactory();
        People p = factory.createPeople();
        p.eat();
        Factory factory1 = new ManFactory();
        People p1 = factory1.createPeople();
        p1.eat();

        People [] app = new People[]{new Woman()};
        app.clone();
        //可以设置为变量   通过反射加载工厂类
        String a = "com.tianxiong.demo.gongchangfangfa.ManFactory";
        try {
            Factory f  = (Factory) Class.forName(a).newInstance();
            People pp = f.createPeople();
            pp.eat();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
