package com.tianxiong.demo.chouxianggongchang;

public class AppleFactory extends PcFactory {

    @Override
    public EarPhone getEarPhone() {
        return null;
    }

    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
