package com.tendy.designpattern.abstract_factory.code;

/**
 * 轮胎
 */

public class Tyre750 implements Tyre {
    @Override
    public String showTyre() {
        return this.getClass().getSimpleName();
    }
}
