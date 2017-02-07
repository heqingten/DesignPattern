package com.tendy.designpattern.abstract_factory.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class Tyre530 implements Tyre {
    @Override
    public String showTyre() {
        return this.getClass().getSimpleName();
    }
}
