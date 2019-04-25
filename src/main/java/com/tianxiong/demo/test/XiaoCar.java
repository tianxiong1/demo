package com.tianxiong.demo.test;

public class XiaoCar implements Car{
    @Override
    public void say() {
        System.out.println("xiaoCar");
    }

    public static void main(String[] args) {
        TopCar top = new XiaoCar();
        System.out.println(top.getClass());
        System.out.println("------"+(top instanceof  TopCar) +(top instanceof  XiaoCar) + (top instanceof  Car));
        Car car = (Car)top;
        System.out.println(car.getClass());
        System.out.println("------"+(car instanceof  TopCar) +(car instanceof  XiaoCar) + (car instanceof  Car));
        XiaoCar xiaoCar = new XiaoCar();
        Car xcar = (Car)xiaoCar;
        System.out.println(xcar.getClass());
        System.out.println("------"+(xcar instanceof  TopCar) +(xcar instanceof  XiaoCar) + (xcar instanceof  Car));
    }
}
