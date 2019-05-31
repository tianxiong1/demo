package com.tianxiong.demo.chouxianggongchang;

public abstract class PcFactory {
    /**
     * 生产耳机
     * @return
     */
     public abstract EarPhone getEarPhone();

    /**
     * 生产Phone
     */
    public abstract Phone getPhone();
}
