package com.tendy.designpattern.abstract_factory.code;


/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class Engine750 implements Engine {
    @Override
    public String showEngine() {
        return this.getClass().getSimpleName();
    }
}
