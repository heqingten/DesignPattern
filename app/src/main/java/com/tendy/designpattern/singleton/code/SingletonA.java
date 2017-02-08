package com.tendy.designpattern.singleton.code;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class SingletonA {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonA instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonA() {

    }

    /* 静态工程方法，创建实例 */
    public static SingletonA getInstance() {
        if (instance == null) {
            instance = new SingletonA();
        }
        return instance;
    }
}
