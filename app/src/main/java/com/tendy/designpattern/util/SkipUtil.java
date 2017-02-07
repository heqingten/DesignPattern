package com.tendy.designpattern.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class SkipUtil {
    public static void startActivity(Context context, Class clazz) {
        Intent intent = new Intent();
        intent.setClass(context, clazz);
        context.startActivity(intent);
    }
}
