package com.tianxiong.demo.jiandangongchang;

/**
 * 简单工厂
 */
public class SimpleFactory {
    public Phone createPhone(String brand){
        switch (brand)
        {
            case "apple":
                return new Apple();
            case "vivo":
                return new Vivo();
            default:
                return null;
        }
    }
}
