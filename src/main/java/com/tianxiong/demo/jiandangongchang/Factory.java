package com.tianxiong.demo.jiandangongchang;

/**
 * 工厂方法
 */
public class Factory {
    private Vivo getVivo(){
        System.out.println("new Vivo之前操作");
        return new Vivo();
    }
    private Apple getApple(){
        System.out.println("new apple之前操作");
        return  new Apple();
    }

    public Phone createPhone(String brand){
            switch (brand)
            {
                case  "apple":
                    return getApple();
                case "vivo":
                    return getVivo();
                default:
                    return null;
            }
    }
}
