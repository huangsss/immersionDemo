package com.huangasys.immersiondemo;

import android.content.Context;

/**
 * Created by huangasys on 2018/7/5.15:14
 *
 * @Describe: 获取状态栏高度;
 */

public class ScreenUtils {
    public static int getStatusHeight(Context context){
        int resId = context.getResources().getIdentifier("status_bar_height","dimen","android");
        if (resId>0) {
            return context.getResources().getDimensionPixelOffset(resId);
        }
        return -1;
    }
}
