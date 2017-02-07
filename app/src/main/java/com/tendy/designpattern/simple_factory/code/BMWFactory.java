package com.tendy.designpattern.simple_factory.code;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class BMWFactory {
    public BMW product(String code) {
        switch (code) {
            case "530":
                return new BMW530();
            case "750":
                return new BMW750();
            default:
                return null;
        }
    }
}
