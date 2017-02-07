package com.tendy.designpattern.simple_factory.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class BMW750 implements BMW {
    @Override
    public String product() {
        return this.getClass().getSimpleName();
    }
}
