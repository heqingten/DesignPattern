package com.tendy.designpattern.singleton.code;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class SingletonC {
    private static SingletonC instance = null;

    private SingletonC() {

    }

    public static SingletonC getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new SingletonC();
                }
            }
        }
        return instance;
    }
}
