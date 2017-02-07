package com.tendy.designpattern.abstract_factory.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class BMW750Factory implements AbsBMWFactory {
    @Override
    public Engine createEngine() {
        return new Engine750();
    }

    @Override
    public Tyre createTyre() {
        return new Tyre750();
    }
}
