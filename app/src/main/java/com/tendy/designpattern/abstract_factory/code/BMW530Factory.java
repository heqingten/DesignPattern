package com.tendy.designpattern.abstract_factory.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class BMW530Factory implements AbsBMWFactory {
    @Override
    public Engine createEngine() {
        return new Engine530();
    }

    @Override
    public Tyre createTyre() {
        return new Tyre530();
    }
}
