package com.tianxiong.demo.test;

import java.math.BigDecimal;

public class XiaoCar implements Car{
    @Override
    public void say() {
        System.out.println("xiaoCar");
    }

    public static void main(String[] args) {
/*        TopCar top = new XiaoCar();
        System.out.println(top.getClass());
        System.out.println("------"+(top instanceof  TopCar) +(top instanceof  XiaoCar) + (top instanceof  Car));
        Car car = (Car)top;
        System.out.println(car.getClass());
        System.out.println("------"+(car instanceof  TopCar) +(car instanceof  XiaoCar) + (car instanceof  Car));
        XiaoCar xiaoCar = new XiaoCar();
        Car xcar = (Car)xiaoCar;
        System.out.println(xcar.getClass());
        System.out.println("------"+(xcar instanceof  TopCar) +(xcar instanceof  XiaoCar) + (xcar instanceof  Car));*/

        Double a = 10.12;
        Double b = 0.08;
        System.out.println(a+b);



        BigDecimal bigDecimal = new BigDecimal("1.2");
        BigDecimal c =  bigDecimal.setScale(3);
        bigDecimal = bigDecimal.setScale(3);
        System.out.println(bigDecimal+"==="+c);
        System.out.println((bigDecimal==c)+"----");



        BigDecimal bigDecima2 = new BigDecimal("1.2");
        //bigDecima2.setScale(3);
        System.out.println(bigDecima2 == bigDecima2.setScale(3));
        XiaoCar xc = new XiaoCar();
        XiaoCar xc2 = new XiaoCar();
        System.out.println("0000000"+(xc==xc2));
        System.out.println(xc);
        System.out.println(xc2);


        String str = "123";
        String str2 = "123";
        System.out.println(str == str2);

        String str3 = new String("123");
        String str4 = new String("123");
        System.out.println(str3 == str4);
    }
}
