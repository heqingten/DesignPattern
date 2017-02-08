package com.tendy.designpattern.singleton.code;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class SingletonB {
    private static SingletonB instance = null;

    private SingletonB() {

    }

    public synchronized static SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}
