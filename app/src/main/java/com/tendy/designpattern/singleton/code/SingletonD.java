package com.tendy.designpattern.singleton.code;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class SingletonD {

    private SingletonD() {

    }

    //在第一次被引用时被加载
    static class SingletonDFactory {
        private static SingletonD instance = new SingletonD();
    }

    public static SingletonD getInstance() {
        return SingletonDFactory.instance;
    }
}
