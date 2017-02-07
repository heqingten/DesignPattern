package com.tendy.designpattern.factory_method.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class BMW530 implements BMW {
    @Override
    public String product() {
        return this.getClass().getSimpleName();
    }
}
