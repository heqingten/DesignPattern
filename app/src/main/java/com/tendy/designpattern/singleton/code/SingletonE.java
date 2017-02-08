package com.tendy.designpattern.singleton.code;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class SingletonE {
    private static SingletonE instance = null;

    private SingletonE() {

    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonE();
        }
    }

    public static SingletonE getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
