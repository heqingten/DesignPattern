package com.tendy.designpattern.factory_method.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class FactoryBMW530 implements FactoryBMW {
    @Override
    public BMW product() {
        return new BMW530();
    }
}
